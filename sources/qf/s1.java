package qf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.xm;
import org.telegram.ui.db;
import org.telegram.ui.ed1;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public k51 a;
    public LinearLayout b;
    public ib0 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public static void U(s1 s1Var, n41 n41Var, View view) {
        if (n41Var.d == -1) {
            boolean z10 = s1Var.h;
            s1Var.h = !z10;
            if (!z10) {
                String str = s1Var.f;
                s1Var.n = str;
                ib0 ib0Var = s1Var.c;
                if (ib0Var != null) {
                    ib0Var.run(str);
                }
            }
            ((p8) view).setChecked(s1Var.h);
            s1Var.a.U2.N(true);
            return;
        }
        if (view.isEnabled()) {
            t1 b10 = t1.b(s1Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = n41Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 >= arrayList.size()) {
                    return;
                }
                b10.g();
                TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(n41Var.d);
                s1Var.h = false;
                String str2 = tL_timezone.id;
                s1Var.n = str2;
                ib0 ib0Var2 = s1Var.c;
                if (ib0Var2 != null) {
                    ib0Var2.run(str2);
                }
                if (s1Var.d) {
                    s1Var.actionBar.h(true);
                }
                s1Var.a.U2.N(true);
            }
        }
    }

    public static void V(s1 s1Var, ArrayList arrayList, b51 b51Var) {
        boolean z10 = s1Var.d && !TextUtils.isEmpty(s1Var.e);
        t1 b10 = t1.b(s1Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            b51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            n41 n41Var = new n41(9);
            n41Var.d = -1;
            n41Var.l = string;
            n41Var.K(s1Var.h);
            arrayList.add(n41Var);
            b51Var.T();
            arrayList.add(n41.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(s1Var.n, true))));
        }
        b51Var.U();
        if (!z10) {
            pa.o(R.string.TimezoneHeader, arrayList);
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
            CharSequence e9 = t1.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(s1Var.e).toLowerCase();
                if (y1.x(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e9 = AndroidUtilities.highlightText(e9, s1Var.e, s1Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f10 = t1.f(tL_timezone);
            n41 n41Var2 = new n41(10);
            n41Var2.d = i10;
            n41Var2.l = e9;
            n41Var2.n = f10;
            n41Var2.K(TextUtils.equals(tL_timezone.id, s1Var.n));
            n41Var2.g = !s1Var.h || z10;
            arrayList.add(n41Var2);
            z11 = false;
            i10++;
        }
        b51Var.T();
        if (z11) {
            arrayList.add(n41.l(s1Var.b));
        } else {
            arrayList.add(n41.B(null));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(13, this));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.D = new db(this, 19);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        k51 k51Var = new k51(this, new a8(this, 23), new lh.p(this, 19), null);
        this.a = k51Var;
        k51Var.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        frameLayout.addView(this.a, z5.c(-1.0f, -1));
        this.a.setOnScrollListener(new xm(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        n9 n9Var = new n9(context);
        n9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(n9Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(n9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        rl.l(g6.y6, this.resourceProvider, textView, 1, 15.0f);
        this.b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        b51 b51Var;
        if (i10 != NotificationCenter.timezonesUpdated || (k51Var = this.a) == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        String c10 = t1.b(this.currentAccount).c();
        this.f = c10;
        this.h = TextUtils.equals(c10, this.n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
