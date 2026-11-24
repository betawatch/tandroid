// default package

import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class u4c extends TLObject {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final /* synthetic */ v4c i;

    public u4c(v4c v4cVar, NativeByteBuffer nativeByteBuffer) {
        this.i = v4cVar;
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 2058772876) {
            this.b = nativeByteBuffer.readInt64(true);
            this.d = nativeByteBuffer.readInt32(true);
            this.e = nativeByteBuffer.readString(true);
            this.f = nativeByteBuffer.readString(true);
            return;
        }
        if (readInt32 != 2058772877) {
            TLParseException.doThrowOrLog(nativeByteBuffer, "UnconfirmedAuth", readInt32, true);
            return;
        }
        this.c = nativeByteBuffer.readInt64(true);
        this.d = nativeByteBuffer.readInt32(true);
        this.e = nativeByteBuffer.readString(true);
        this.f = nativeByteBuffer.readString(true);
    }

    public final long a() {
        return (na7.q1(this.i.a).k4.i3.g(TimeUnit.SECONDS) + ConnectionsManager.getInstance(r0.a).getCurrentTime()) - this.d;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z = this.a;
        String str = this.f;
        String str2 = this.e;
        int i = this.d;
        if (z) {
            outputSerializedData.writeInt32(2058772877);
            outputSerializedData.writeInt64(this.c);
            outputSerializedData.writeInt32(i);
            outputSerializedData.writeString(str2);
            outputSerializedData.writeString(str);
            return;
        }
        outputSerializedData.writeInt32(2058772876);
        outputSerializedData.writeInt64(this.b);
        outputSerializedData.writeInt32(i);
        outputSerializedData.writeString(str2);
        outputSerializedData.writeString(str);
    }

    public u4c(v4c v4cVar, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.i = v4cVar;
        this.b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f = tL_updateNewAuthorization.location;
    }

    public u4c(v4c v4cVar, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.i = v4cVar;
        this.a = true;
        long j = tL_updateNewBotConnection.bot_id;
        this.c = j;
        this.b = j;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f = tL_updateNewBotConnection.location;
    }
}
