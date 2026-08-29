package sf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.bb;
import org.telegram.ui.th;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public u51 a;
    public LinearLayout b;
    public yu0 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(u1 u1Var, w41 w41Var, View view) {
        if (w41Var.d == -1) {
            boolean z10 = u1Var.h;
            u1Var.h = !z10;
            if (!z10) {
                String str = u1Var.f;
                u1Var.n = str;
                yu0 yu0Var = u1Var.c;
                if (yu0Var != null) {
                    yu0Var.run(str);
                }
            }
            ((q8) view).setChecked(u1Var.h);
            u1Var.a.U2.N(true);
            return;
        }
        if (view.isEnabled()) {
            v1 b10 = v1.b(u1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = w41Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(w41Var.d);
                u1Var.h = false;
                String str2 = tL_timezone.id;
                u1Var.n = str2;
                yu0 yu0Var2 = u1Var.c;
                if (yu0Var2 != null) {
                    yu0Var2.run(str2);
                }
                if (u1Var.d) {
                    u1Var.actionBar.h(true);
                }
                u1Var.a.U2.N(true);
            }
        }
    }

    public static void V(u1 u1Var, ArrayList arrayList, k51 k51Var) {
        boolean z10 = u1Var.d && !TextUtils.isEmpty(u1Var.e);
        v1 b10 = v1.b(u1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            k51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            w41 w41Var = new w41(9);
            w41Var.d = -1;
            w41Var.l = string;
            w41Var.K(u1Var.h);
            arrayList.add(w41Var);
            k51Var.T();
            arrayList.add(w41.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(u1Var.n, true))));
        }
        k51Var.U();
        if (!z10) {
            th.p(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z11 = true;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e10 = v1.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(u1Var.e).toLowerCase();
                if (x3.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e10 = AndroidUtilities.highlightText(e10, u1Var.e, u1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f9 = v1.f(tL_timezone);
            w41 w41Var2 = new w41(10);
            w41Var2.d = i10;
            w41Var2.l = e10;
            w41Var2.n = f9;
            w41Var2.K(TextUtils.equals(tL_timezone.id, u1Var.n));
            w41Var2.g = !u1Var.h || z10;
            arrayList.add(w41Var2);
            z11 = false;
            i10++;
        }
        k51Var.T();
        if (z11) {
            arrayList.add(w41.l(u1Var.b));
        } else {
            arrayList.add(w41.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 13));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        u51 u51Var = new u51(this, new t4(this, 24), new f1(this, 1), null);
        this.a = u51Var;
        u51Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, f6.c(-1.0f, -1));
        this.a.setOnScrollListener(new h00(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        t9 t9Var = new t9(context);
        t9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(t9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(t9Var, f6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        org.telegram.ui.b.m(g6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, f6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        k51 k51Var;
        if (i10 != NotificationCenter.timezonesUpdated || (u51Var = this.a) == null || (k51Var = u51Var.U2) == null) {
            return;
        }
        k51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        String c3 = v1.b(this.currentAccount).c();
        this.f = c3;
        this.h = TextUtils.equals(c3, this.n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
