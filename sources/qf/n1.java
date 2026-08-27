package qf;

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
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.util.ArrayList;
import java.util.Collections;
import jh.m5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e80;
import org.telegram.ui.j70;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public static b2 h;
    public k51 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.v0 d;
    public int e;
    public boolean f;

    public n1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(n1 n1Var, int i10, ArrayList arrayList) {
        if (i10 == n1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((n41) arrayList.get(i11)).G instanceof p1) {
                    ((p1) ((n41) arrayList.get(i11)).G).c = i11;
                }
            }
            q1 f10 = q1.f(n1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = i0.a.f(((p1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new lp0(23));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((p1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = i0.a.f(((p1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new m5(19));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void V(n1 n1Var, ArrayList arrayList, b51 b51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        n41 n41Var = new n41(2);
        n41Var.l = string;
        n41Var.o = string2;
        n41Var.m = "RestrictedEmoji";
        n41Var.n = "📝";
        arrayList.add(n41Var);
        b51Var.U();
        q1 f10 = q1.f(n1Var.currentAccount);
        ArrayList arrayList2 = f10.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((p1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((p1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f10.a).quickRepliesLimit) {
            n41 c10 = n41.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c10.q = true;
            arrayList.add(c10);
        }
        n1Var.e = b51Var.M();
        ArrayList arrayList3 = q1.f(n1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            p1 p1Var = (p1) obj;
            n41 n41Var2 = new n41(16);
            n41Var2.G = p1Var;
            n41Var2.K(n1Var.b.contains(Integer.valueOf(p1Var.a)));
            arrayList.add(n41Var2);
        }
        b51Var.L();
        b51Var.T();
        pa.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(n1 n1Var, n41 n41Var, View view) {
        if (n41Var.d == 1) {
            d0(n1Var.getParentActivity(), n1Var.currentAccount, null, null, n1Var.getResourceProvider(), new n6(n1Var, 16));
            return;
        }
        if (n41Var.a == 16 && (n41Var.G instanceof p1)) {
            if (!n1Var.b.isEmpty()) {
                n1Var.e0(n41Var, view);
                return;
            }
            p1 p1Var = (p1) n41Var.G;
            if (p1Var.g) {
                return;
            }
            Bundle g10 = a9.p.g(5, "chatMode");
            g10.putLong("user_id", n1Var.getUserConfig().getClientUserId());
            g10.putString("quick_reply", p1Var.b);
            rn rnVar = new rn(g10);
            rnVar.nb(p1Var.a);
            n1Var.presentFragment(rnVar);
        }
    }

    public static void X(n1 n1Var) {
        n1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) n1Var.a, (d5.d) new j4.w0(17));
        n1Var.actionBar.s();
        n1Var.a.w1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void d0(Activity activity, int i10, String str, p1 p1Var, c6 c6Var, Utilities.Callback callback) {
        ?? r32;
        n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof zu0) && ((zu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        b2[] b2VarArr = new b2[1];
        AlertDialog$Builder e2Var = z10 ? new e2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString((p1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        b2 b2Var = e2Var.a;
        b2Var.N = string;
        final h1 h1Var = new h1(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        h1Var.setTextSize(1, 18.0f);
        h1Var.setText(p1Var == null ? str == null ? "" : str : p1Var.b);
        int i11 = g6.j5;
        h1Var.setTextColor(g6.v0(i11, c6Var));
        h1Var.setHintColor(g6.v0(g6.Xh, c6Var));
        h1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        h1Var.setSingleLine(true);
        h1Var.setFocusable(true);
        h1Var.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        h1Var.setImeOptions(6);
        h1Var.setBackgroundDrawable(null);
        h1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        h1Var.setFilters(new InputFilter[]{new i1()});
        LinearLayout f10 = y1.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        rl.l(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((p1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, z5.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        rl.l(g6.q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, z5.e(-1, -2, 83));
        Runnable[] runnableArr = {new b(r15, 6)};
        cg.e1 e1Var = new cg.e1(runnableArr, new ValueAnimator[1], textView2, textView, 16);
        h1Var.addTextChangedListener(new j1(textView2, runnableArr));
        f10.addView(frameLayout, z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(h1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(f10);
        b2Var.a = AndroidUtilities.dp(292.0f);
        h1Var.setOnEditorActionListener(new k1(h1Var, i10, p1Var, textView2, e1Var, callback, b2VarArr, currentFocus));
        e2Var.k(LocaleController.getString(R.string.Done), new e80(h1Var, e1Var, i10, p1Var, textView2, callback));
        e2Var.h(LocaleController.getString(R.string.Cancel), new j70(22));
        if (z10) {
            h = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new o(1, currentFocus));
            b2 b2Var2 = h;
            r32 = 0;
            final boolean z11 = false ? 1 : 0;
            b2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qf.f1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z11) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            break;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            b2Var.K = new n6(h1Var, 17);
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new ag.j0(h1Var, 12));
            final int i12 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: qf.f1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            h1 h1Var2 = h1Var;
                            h1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var2);
                            break;
                        default:
                            h1 h1Var3 = h1Var;
                            h1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(h1Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[r32].d0 = r32;
        h1Var.setSelection(h1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new g1(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(g6.w0(null, g6.y8, false));
        j10.addView(this.c, z5.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new kh.e(2));
        org.telegram.ui.ActionBar.v0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        d51 d51Var = new d51(context, null, 5);
        d51Var.setBackgroundColor(g6.w0(null, g6.a7, false));
        final int i10 = 0;
        k51 k51Var = new k51(this, new Utilities.Callback2(this) { // from class: qf.d1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        n1.V(this.b, (ArrayList) obj, (b51) obj2);
                        break;
                    default:
                        n1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new e1(this), new e1(this));
        this.a = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.a;
        k51Var2.U2.r = false;
        final int i11 = 1;
        k51Var2.B1(new Utilities.Callback2(this) { // from class: qf.d1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        n1.V(this.b, (ArrayList) obj, (b51) obj2);
                        break;
                    default:
                        n1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        d51Var.addView(this.a, z5.c(-1.0f, -1));
        this.actionBar.B(this.a, true);
        this.fragmentView = d51Var;
        return d51Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        b51 b51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (k51Var = this.a) == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    public final void e0(n41 n41Var, View view) {
        p1 p1Var = (p1) n41Var.G;
        m1 m1Var = (m1) view;
        Integer valueOf = Integer.valueOf(p1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(p1Var.a));
        } else {
            arrayList.add(Integer.valueOf(p1Var.a));
        }
        this.a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(p1Var.a));
        n41Var.e = contains;
        m1Var.d.a(contains, true);
        if (this.actionBar.t() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.s();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.c.a(Math.max(1, arrayList.size()), true);
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            p1 c10 = q1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c10 == null || q1.g(c10.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            rl.o(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), er.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        q1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
