// default package

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t0c implements fn3 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ k47 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public t0c(Integer num, k47 k47Var, int i, long j, long j2) {
        this.a = num;
        this.b = k47Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fn3
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = v0c.S;
            Integer num = this.a;
            hashMap.remove(num);
            v0c.R.remove(num);
        }
        k47 k47Var = this.b;
        if (str == null) {
            v0c.n(k47Var);
            return;
        }
        TLRPC.Message message = k47Var.k;
        if (z) {
            gm.d3(new vf(k47Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
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
        v0c.q(k47Var);
        nm7.f(this.c).k(nm7.A1, k47Var, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
