package xh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements q20 {
    public final /* synthetic */ pb1 a;
    public final /* synthetic */ ay b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h1(pb1 pb1Var, ay ayVar, long j10, int i10) {
        this.a = pb1Var;
        this.b = ayVar;
        this.c = j10;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        pb1 pb1Var = this.a;
        ay ayVar = this.b;
        if (pb1Var != null) {
            pb1Var.finishFragment();
            ayVar.removeSelfFromStack();
        } else {
            ayVar.finishFragment();
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.c;
        int i10 = this.d;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            str = h20.k(Z1);
            chat = Z1;
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 == null) {
                str = "";
                chat = L0;
            } else {
                str = L0.title;
                chat = L0;
            }
        }
        cc a02 = cc.a0(T);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), W2, null, null).k(false);
    }
}
