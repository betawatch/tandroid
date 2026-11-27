// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x09 extends e implements fn7 {
    public static id f;
    public q9c a;
    public final ArrayList b;
    public sla c;
    public int d;
    public boolean e;

    public x09() {
        super(null);
        this.b = new ArrayList();
        this.e = true;
    }

    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static void g0(Activity activity, int i, String str, a19 a19Var, vnb vnbVar, pcc pccVar) {
        ?? r10;
        e Q = LaunchActivity.Q();
        Activity W = hl.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        boolean z = false;
        boolean z2 = Q != null && (Q.getFragmentView() instanceof wma) && ((wma) Q.getFragmentView()).Q() > hl.L(20.0f);
        id[] idVarArr = new id[1];
        AlertDialog$Builder ndVar = z2 ? new nd(0, vnbVar, activity) : new AlertDialog$Builder(0, vnbVar, activity);
        String M0 = ob6.M0((a19Var == null && str == null) ? 2131752640 : 2131752654, null);
        id idVar = ndVar.a;
        idVar.S = M0;
        final f42 f42Var = new f42(activity, vnbVar);
        ls6.d0(i).O(hl.F0(), true);
        f42Var.setTextSize(1, 18.0f);
        f42Var.setText(a19Var == null ? str == null ? "" : str : a19Var.b);
        int i2 = aob.j5;
        yob.X(f42Var, i2, vnbVar);
        yob.l(f42Var, 34, aob.Oi, vnbVar);
        f42Var.setHintText(ob6.M0(2131752642, null));
        f42Var.setSingleLine(true);
        f42Var.setFocusable(true);
        yob.F(f42Var, aob.k6, aob.l6, aob.p7, vnbVar);
        f42Var.setImeOptions(6);
        f42Var.setBackgroundDrawable(null);
        f42Var.setPadding(0, 0, hl.L(42.0f), 0);
        f42Var.setFilters(new InputFilter[]{new jc6((byte) 1)});
        LinearLayout m = bs2.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0((a19Var == null && str == null) ? 2131752641 : 2131752655, null));
        frameLayout.addView(textView, tre.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        yob.X(textView2, aob.q7, vnbVar);
        bs2.r(16.0f, 1, 2131752643, textView2, null);
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, tre.e(-1, -2, 83));
        Runnable[] runnableArr = {new uk8(r15, (byte) 21)};
        ku0 ku0Var = new ku0((Object) runnableArr, (Object) new ValueAnimator[1], (Object) textView2, (Object) textView, (byte) 16);
        f42Var.addTextChangedListener(new ry(textView2, runnableArr, z, (byte) 10));
        m.addView(frameLayout, tre.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        m.addView(f42Var, tre.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        ndVar.n(m);
        idVar.a = hl.L(292.0f);
        f42Var.setOnEditorActionListener(new u09(f42Var, i, a19Var, textView2, ku0Var, pccVar, idVarArr, currentFocus));
        ndVar.j(ob6.M0(2131751319, null), new zz5(f42Var, ku0Var, i, a19Var, textView2, pccVar));
        ndVar.g(ob6.M0(2131752570, null), new iy8((byte) 5));
        if (z2) {
            f = idVar;
            r10 = 0;
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new i41(currentFocus, (byte) 2));
            id idVar2 = f;
            final boolean z3 = false ? 1 : 0;
            idVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: t09
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = z3;
                    f42 f42Var2 = f42Var;
                    switch (b) {
                        case 0:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            break;
                        default:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            break;
                    }
                }
            });
            f.q(250L);
        } else {
            r10 = 0;
            idVar.P = new ji7(f42Var, (byte) 25);
            idVarArr[0] = idVar;
            idVar.setOnDismissListener(new dl8(f42Var, (byte) 3));
            final byte b = 1;
            idVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: t09
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b2 = b;
                    f42 f42Var2 = f42Var;
                    switch (b2) {
                        case 0:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            break;
                        default:
                            f42Var2.requestFocus();
                            hl.E3(f42Var2);
                            break;
                    }
                }
            });
            idVarArr[0].show();
        }
        idVarArr[r10].k0 = r10;
        f42Var.setSelection(f42Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 1;
        setHasOwnBackground(true);
        final byte b2 = 0;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131752664, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 7));
        rla r = this.simpleActionBar.r();
        sla a = r.a(1, R.drawable.msg_edit);
        this.c = a;
        a.setContentDescription(ob6.M0(2131751300, null));
        r.a(2, R.drawable.msg_delete).setContentDescription(ob6.M0(2131751563, null));
        b84 b84Var = new b84(context, null, (byte) 2);
        q9c q9cVar = new q9c(this, new icc(this) { // from class: r09
            public final /* synthetic */ x09 b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                x09 x09Var = this.b;
                switch (b3) {
                    case 0:
                        x09Var.e0((ArrayList) obj, (l9c) obj2);
                        break;
                    default:
                        x09Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new s09(this), new s09(this));
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.a;
        q9cVar2.g3.r = false;
        q9cVar2.F1(new icc(this) { // from class: r09
            public final /* synthetic */ x09 b;

            {
                this.b = this;
            }

            @Override // icc
            public final void a(Object obj, Object obj2) {
                byte b3 = b;
                x09 x09Var = this.b;
                switch (b3) {
                    case 0:
                        x09Var.e0((ArrayList) obj, (l9c) obj2);
                        break;
                    default:
                        x09Var.i0(((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        b84Var.addView(this.a, tre.c(-1.0f, -1));
        this.fragmentView = b84Var;
        return b84Var;
    }

    public final void d0() {
        this.b.clear();
        hl.d0(this.a, new bm0((byte) 23));
        this.simpleActionBar.y();
        this.a.A1(false);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q9c q9cVar;
        l9c l9cVar;
        if (i != jn7.F1 || (q9cVar = this.a) == null || (l9cVar = q9cVar.g3) == null) {
            return;
        }
        l9cVar.O(true);
    }

    public final void e0(ArrayList arrayList, l9c l9cVar) {
        String M0 = ob6.M0(2131752664, null);
        String M02 = ob6.M0(2131752651, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.n = "RestrictedEmoji";
        b8cVar.o = "📝";
        arrayList.add(b8cVar);
        l9cVar.V();
        b19 f2 = b19.f(this.currentAccount);
        ArrayList arrayList2 = f2.b;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            i2 = (i2 != 0 || "hello".equalsIgnoreCase(((a19) arrayList2.get(i4)).b)) ? 1 : 0;
            i3 = (i3 != 0 || "away".equalsIgnoreCase(((a19) arrayList2.get(i4)).b)) ? 1 : 0;
            if (i2 != 0 && i3 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i2 ^ 1) + (i3 ^ 1) < uc7.s1(f2.a).l4.i2.f()) {
            b8c c = b8c.c(1, R.drawable.msg_viewintopic, ob6.M0(2131752663, null));
            c.r = true;
            arrayList.add(c);
        }
        this.d = l9cVar.M();
        ArrayList arrayList3 = b19.f(this.currentAccount).b;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            a19 a19Var = (a19) obj;
            b8c b8cVar2 = new b8c(16);
            b8cVar2.H = a19Var;
            b8cVar2.L(this.b.contains(Integer.valueOf(a19Var.a)));
            arrayList.add(b8cVar2);
        }
        l9cVar.L();
        l9cVar.U();
        arrayList.add(b8c.C(ob6.M0(2131752662, null)));
    }

    public final void f0(b8c b8cVar, View view) {
        if (b8cVar.d == 1) {
            g0(getParentActivity(), this.currentAccount, null, null, getResourceProvider(), new ji7(this, (byte) 24));
            return;
        }
        if (b8cVar.a == 16 && (b8cVar.H instanceof a19)) {
            if (!this.b.isEmpty()) {
                h0(b8cVar, view);
                return;
            }
            a19 a19Var = (a19) b8cVar.H;
            if (a19Var.g) {
                return;
            }
            Bundle j = qu6.j(5, "chatMode");
            j.putLong("user_id", getUserConfig().e());
            j.putString("quick_reply", a19Var.b);
            zu1 zu1Var = new zu1(j);
            zu1Var.Mb(a19Var.a);
            presentFragment(zu1Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    public final void h0(b8c b8cVar, View view) {
        a19 a19Var = (a19) b8cVar.H;
        w09 w09Var = (w09) view;
        Integer valueOf = Integer.valueOf(a19Var.a);
        ArrayList arrayList = this.b;
        boolean contains = arrayList.contains(valueOf);
        int i = a19Var.a;
        if (contains) {
            arrayList.remove(Integer.valueOf(i));
        } else {
            arrayList.add(Integer.valueOf(i));
        }
        this.a.A1(!arrayList.isEmpty());
        boolean contains2 = arrayList.contains(Integer.valueOf(a19Var.a));
        b8cVar.e = contains2;
        w09Var.d.a(contains2, true);
        if (this.simpleActionBar.z() == arrayList.isEmpty()) {
            boolean isEmpty = arrayList.isEmpty();
            jla jlaVar = this.simpleActionBar;
            if (isEmpty) {
                jlaVar.y();
            } else {
                jlaVar.L();
            }
        }
        this.simpleActionBar.H(Math.max(1, arrayList.size()), true);
        boolean z = false;
        boolean z2 = arrayList.size() == 1;
        if (z2) {
            a19 c = b19.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            if (c != null && !b19.g(c.b)) {
                z = true;
            }
            z2 = z;
        }
        if (this.e != z2) {
            this.e = z2;
            this.c.Y(z2, true);
        }
    }

    public final void i0(int i, ArrayList arrayList) {
        if (i == this.d) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((b8c) arrayList.get(i2)).H instanceof a19) {
                    ((a19) ((b8c) arrayList.get(i2)).H).c = i2;
                }
            }
            b19 f2 = b19.f(this.currentAccount);
            ArrayList arrayList2 = f2.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < arrayList2.size(); i3 = qd4.g(((a19) arrayList2.get(i3)).a, i3, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new qq7((byte) 12));
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (((a19) arrayList2.get(i4)).a != ((Integer) arrayList3.get(i4)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i5 = 0; i5 < arrayList2.size(); i5 = qd4.g(((a19) arrayList2.get(i5)).a, i5, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f2.a).sendRequest(tL_messages_reorderQuickReplies, new xe2((byte) 5));
                    f2.l();
                    return;
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.F1);
        b19.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.F1);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
