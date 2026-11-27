// default package

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s2c implements mm3 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public s2c(Integer num, r47 r47Var, int i, long j, long j2) {
        this.a = num;
        this.b = r47Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mm3
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = u2c.S;
            Integer num = this.a;
            hashMap.remove(num);
            u2c.R.remove(num);
        }
        r47 r47Var = this.b;
        if (str == null) {
            u2c.n(r47Var);
            return;
        }
        TLRPC.Message message = r47Var.k;
        if (z) {
            hl.d3(new he(r47Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
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
        u2c.q(r47Var);
        jn7.f(this.c).k(jn7.A1, r47Var, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
