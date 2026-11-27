// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vx9 extends TLObject {
    public int a;
    public TLRPC.TL_decryptedMessageLayer b;
    public TLRPC.EncryptedFile c;
    public boolean d;
    public byte e;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        inputSerializedData.readInt64(z);
        this.a = inputSerializedData.readInt32(z);
        this.b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        if (inputSerializedData.readBool(z)) {
            this.c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        this.d = inputSerializedData.readBool(z);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(TLRPC.TL_message_secret_layer72.constructor);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.a);
        this.b.serializeToStream(outputSerializedData);
        outputSerializedData.writeBool(this.c != null);
        TLRPC.EncryptedFile encryptedFile = this.c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
