// default package

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class syb implements ul3 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ k27 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public syb(Integer num, k27 k27Var, int i, long j, long j2) {
        this.a = num;
        this.b = k27Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ul3
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = uyb.S;
            Integer num = this.a;
            hashMap.remove(num);
            uyb.R.remove(num);
        }
        k27 k27Var = this.b;
        if (str == null) {
            uyb.n(k27Var);
            return;
        }
        TLRPC.Message message = k27Var.k;
        if (z) {
            gl.e3(new qe(k27Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        message.voiceTranscription = str;
        message.voiceTranscriptionWords = iArr;
        message.voiceTranscriptionLocal = true;
        message.voiceTranscriptionFinal = false;
        message.voiceTranscriptionOpen = true;
        uyb.q(k27Var);
        kk7.f(this.c).k(kk7.z1, k27Var, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
