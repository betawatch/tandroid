package xh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements r20 {
    public final /* synthetic */ nb1 a;
    public final /* synthetic */ zx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ h1(nb1 nb1Var, zx zxVar, long j10, int i10) {
        this.a = nb1Var;
        this.b = zxVar;
        this.c = j10;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        nb1 nb1Var = this.a;
        zx zxVar = this.b;
        if (nb1Var != null) {
            nb1Var.finishFragment();
            zxVar.removeSelfFromStack();
        } else {
            zxVar.finishFragment();
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.c;
        int i10 = this.d;
        if (j10 >= 0) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            str = i20.k(Z1);
            chat = Z1;
        } else {
            TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
            if (L0 == null) {
                str = "";
                chat = L0;
            } else {
                str = L0.title;
                chat = L0;
            }
        }
        cc a02 = cc.a0(T);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), W2, null, null).k(false);
    }
}
