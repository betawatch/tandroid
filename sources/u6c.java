// default package

import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u6c extends TLObject {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final String f;
    public final /* synthetic */ v6c i;

    public u6c(v6c v6cVar, NativeByteBuffer nativeByteBuffer) {
        this.i = v6cVar;
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
        return (oc7.r1(this.i.a).l4.i3.g(TimeUnit.SECONDS) + ConnectionsManager.getInstance(r0.a).getCurrentTime()) - this.d;
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

    public u6c(v6c v6cVar, TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        this.i = v6cVar;
        this.b = tL_updateNewAuthorization.hash;
        this.d = tL_updateNewAuthorization.date;
        this.e = tL_updateNewAuthorization.device;
        this.f = tL_updateNewAuthorization.location;
    }

    public u6c(v6c v6cVar, TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        this.i = v6cVar;
        this.a = true;
        long j = tL_updateNewBotConnection.bot_id;
        this.c = j;
        this.b = j;
        this.d = tL_updateNewBotConnection.date;
        this.e = tL_updateNewBotConnection.device;
        this.f = tL_updateNewBotConnection.location;
    }
}
