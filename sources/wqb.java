// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wqb extends d implements jm7 {
    public q7c a;
    public LinearLayout b;
    public u35 c;
    public boolean d;
    public String e;
    public String f;
    public boolean h;
    public String n;

    public final void Z(ArrayList arrayList, l7c l7cVar) {
        boolean z = this.d && !TextUtils.isEmpty(this.e);
        xqb b = xqb.b(this.currentAccount);
        ArrayList arrayList2 = b.d;
        if (!z) {
            l7cVar.V();
            String M0 = jb6.M0(2131743805, null);
            c6c c6cVar = new c6c(9);
            c6cVar.d = -1;
            c6cVar.m = M0;
            c6cVar.L(this.h);
            arrayList.add(c6cVar);
            l7cVar.U();
            arrayList.add(c6c.C(jb6.a0(null, null, 2131743804, b.d(this.n, true))));
        }
        l7cVar.V();
        if (!z) {
            aq1.o(2131743803, null, arrayList);
        }
        boolean z2 = true;
        int i = 0;
        while (true) {
            b.g();
            if (i >= arrayList2.size()) {
                break;
            }
            b.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i);
            CharSequence e = xqb.e(tL_timezone, false);
            if (z) {
                String replace = gm.I3(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = gm.I3(this.e).toLowerCase();
                if (hg9.s(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = gm.u1(e, this.e, this.resourceProvider);
                } else {
                    i++;
                }
            }
            String f = xqb.f(tL_timezone);
            c6c c6cVar2 = new c6c(10);
            c6cVar2.d = i;
            c6cVar2.m = e;
            c6cVar2.o = f;
            c6cVar2.L(TextUtils.equals(tL_timezone.id, this.n));
            c6cVar2.g = !this.h || z;
            arrayList.add(c6cVar2);
            z2 = false;
            i++;
        }
        l7cVar.U();
        if (z2) {
            arrayList.add(c6c.m(this.b));
        } else {
            arrayList.add(c6c.C(null));
        }
    }

    public final void a0(c6c c6cVar, View view) {
        if (c6cVar.d == -1) {
            boolean z = this.h;
            this.h = !z;
            if (!z) {
                String str = this.f;
                this.n = str;
                u35 u35Var = this.c;
                if (u35Var != null) {
                    u35Var.a(str);
                }
            }
            ((bjb) view).setChecked(this.h);
            this.a.g3.O(true);
            return;
        }
        if (view.isEnabled()) {
            xqb b = xqb.b(this.currentAccount);
            ArrayList arrayList = b.d;
            int i = c6cVar.d;
            if (i >= 0) {
                b.g();
                if (i < arrayList.size()) {
                    b.g();
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(c6cVar.d);
                    this.h = false;
                    String str2 = tL_timezone.id;
                    this.n = str2;
                    u35 u35Var2 = this.c;
                    if (u35Var2 != null) {
                        u35Var2.a(str2);
                    }
                    if (this.d) {
                        this.simpleActionBar.o(true);
                    }
                    this.a.g3.O(true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131743801, null));
        byte b = 20;
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, b));
        zja a = this.simpleActionBar.t().a(1, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q20(this, (byte) 22);
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        FrameLayout frameLayout = new FrameLayout(context);
        q7c q7cVar = new q7c(this, new o6b(this, (byte) 6), new wta(this, b), null);
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setSectionsDrawBackground(true);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        this.a.setOnScrollListener(new k2b(this, (byte) 3));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        this.b.setMinimumHeight(gm.L(500.0f));
        bf0 bf0Var = new bf0(context);
        bf0Var.getImageReceiver().A1 = false;
        hs6.d0(this.currentAccount).e2(bf0Var, "RestrictedEmoji", "🌖", "130_130");
        this.b.addView(bf0Var, qoe.t(nm7.N1, nm7.N1, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131743802, null));
        anb.X(textView, cmb.x6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.b.addView(textView, qoe.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q7c q7cVar;
        l7c l7cVar;
        if (i != nm7.t3 || (q7cVar = this.a) == null || (l7cVar = q7cVar.g3) == null) {
            return;
        }
        l7cVar.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        String c = xqb.b(this.currentAccount).c();
        this.f = c;
        this.h = TextUtils.equals(c, this.n);
        getNotificationCenter().b(this, nm7.t3);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.t3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
