package net.dmly.refference.container.java_based_config.bean_annotation;

public class TransferServiceImpl implements TransferService {
    public TransferServiceImpl() {

    }

    @Override
    public void transfer() {
        System.out.println("TransferServiceImpl#transfer()");
    }
}
