package seedu.addressbook.storage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

public class StorageStub extends Storage{

    public StorageStub(String filePath) throws InvalidStorageFilePathException {
        super(filePath);
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     */
    

    public void save(AddressBook addressBook) {
        // TODO Auto-generated method stub
        
    }

}
