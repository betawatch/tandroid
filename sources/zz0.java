// default package

import java.util.concurrent.Executor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zz0 {
    public final int a;
    public final TLRPC.InputGroupCall b;
    public final int c;
    public final boolean d;
    public final Executor e;
    public final wh9 f;

    public zz0(int i, TLRPC.InputGroupCall inputGroupCall, int i2, boolean z, Executor executor, wh9 wh9Var) {
        this.a = i;
        this.b = inputGroupCall;
        this.c = i2;
        this.d = z;
        this.e = executor;
        this.f = wh9Var;
    }

    public final jh a(iz0 iz0Var, hz0 hz0Var) {
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.b;
        tL_inputGroupCallStream.time_ms = iz0Var.c;
        tL_inputGroupCallStream.scale = 0;
        int i = iz0Var.b;
        if (i != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i;
            tL_inputGroupCallStream.video_quality = iz0Var.d;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        tL_upload_getFile.offset = 0L;
        tL_upload_getFile.limit = i != 0 ? TLObject.FLAG_19 : 131072;
        return new jh(this, ConnectionsManager.getInstance(this.a).sendRequest(tL_upload_getFile, new o(this, hz0Var, (byte) 29), 2, 2, this.c), (byte) 2);
    }

    public final void b(vy0 vy0Var) {
        boolean z = this.d;
        int i = this.a;
        if (!z) {
            this.e.execute(new et(vy0Var, ConnectionsManager.getInstance(i).getCurrentTimeMillis(), (byte) 4));
        } else {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = this.b;
            ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamchannels, new o(this, vy0Var, (byte) 28), 2, 2, this.c);
        }
    }
}
