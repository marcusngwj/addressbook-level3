package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Represents the file used to store address book data.
 */
public class StorageFile extends Storage{

    /** Default file path used if the user doesn't provide the file name. */
    public static final String DEFAULT_STORAGE_FILEPATH = "addressbook.txt";

    /* Note: Note the use of nested classes below.
     * More info https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
     */

    

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

    

    /**
     * @throws InvalidStorageFilePathException if the default path is invalid
     */
    public StorageFile() throws InvalidStorageFilePathException {
        super(DEFAULT_STORAGE_FILEPATH);
    }


    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        super.save(addressBook);
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return super.load();
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

}
