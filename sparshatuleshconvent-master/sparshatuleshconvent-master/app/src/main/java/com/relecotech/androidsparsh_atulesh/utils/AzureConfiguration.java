package com.relecotech.androidsparsh_atulesh.utils;

import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;

/**
 * Created by Relecotech on 01-02-2018.
 */

public class AzureConfiguration {

    public static String DEVELOPER_KEY = "AIzaSyDZEpCIRqY3mrXcZCp1y74ifi9upWssi0U";

    public static String SenderId = "1046510766674";
    public static String HubName = "Atulesh18NotificationHub";
    public static String HubListenConnectionString = "Endpoint=sb://atulesh18notificationhubns.servicebus.windows.net/;SharedAccessKeyName=DefaultFullSharedAccessSignature;SharedAccessKey=gmzp68UFxyp278oqv6ahEB0+lrsjjUv8Vv4vqL6wffI=";

    public static String containerName = "combined2container";
    public static String storageConnectionString = "DefaultEndpointsProtocol=https;AccountName=combined2storage;AccountKey=llHutQw7xQF2EQeAA+tjzM9KCGqRgeFkZqJzyOvSt2G4hcMul3RPp5UW3nvbWTDClzDE0E2fuOCzNAY8v6niyg==;EndpointSuffix=core.windows.net";
    public static String Storage_url = "https://combined2storage.blob.core.windows.net/combined2container/";

    public static CloudBlobContainer getContainer() throws Exception {
        // Retrieve storage account from connection-string.

        CloudStorageAccount storageAccount = CloudStorageAccount.parse(AzureConfiguration.storageConnectionString);

        // Create the blob client.
        CloudBlobClient blobClient = storageAccount.createCloudBlobClient();
        // Get a reference to a container.
        // The container name must be lower case
        CloudBlobContainer container = blobClient.getContainerReference(AzureConfiguration.containerName);

        return container;
    }
}
