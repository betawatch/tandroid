package vf;

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
import java.util.ArrayList;
import java.util.Collections;
import k7.c6;
import oh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.s2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.du;
import org.telegram.ui.n80;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.v9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public static d2 h;
    public i61 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.w0 d;
    public int e;
    public boolean f;

    public m1() {
        super(null);
        this.b = new ArrayList();
        this.f = true;
    }

    public static void U(m1 m1Var, int i10, ArrayList arrayList) {
        if (i10 == m1Var.e) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((j51) arrayList.get(i11)).G instanceof o1) {
                    ((o1) ((j51) arrayList.get(i11)).G).c = i11;
                }
            }
            p1 f10 = p1.f(m1Var.currentAccount);
            ArrayList arrayList2 = f10.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = yh.d(((o1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new du(23));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((o1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = yh.d(((o1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f10.a).sendRequest(tL_messages_reorderQuickReplies, new p5(19));
                    f10.l();
                    return;
                }
            }
        }
    }

    public static void V(m1 m1Var, ArrayList arrayList, x51 x51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        j51 j51Var = new j51(2);
        j51Var.l = string;
        j51Var.o = string2;
        j51Var.m = "RestrictedEmoji";
        j51Var.n = "📝";
        arrayList.add(j51Var);
        x51Var.U();
        p1 f10 = p1.f(m1Var.currentAccount);
        ArrayList arrayList2 = f10.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((o1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((o1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f10.a).quickRepliesLimit) {
            j51 c3 = j51.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c3.q = true;
            arrayList.add(c3);
        }
        m1Var.e = x51Var.M();
        ArrayList arrayList3 = p1.f(m1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            j51 j51Var2 = new j51(16);
            j51Var2.G = o1Var;
            j51Var2.K(m1Var.b.contains(Integer.valueOf(o1Var.a)));
            arrayList.add(j51Var2);
        }
        x51Var.L();
        x51Var.T();
        yh.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(m1 m1Var, j51 j51Var, View view) {
        if (j51Var.d == 1) {
            d0(m1Var.getParentActivity(), m1Var.currentAccount, null, null, m1Var.getResourceProvider(), new org.telegram.ui.web.d1(m1Var, 21));
            return;
        }
        if (j51Var.a == 16 && (j51Var.G instanceof o1)) {
            if (!m1Var.b.isEmpty()) {
                m1Var.e0(j51Var, view);
                return;
            }
            o1 o1Var = (o1) j51Var.G;
            if (o1Var.g) {
                return;
            }
            Bundle h9 = android.support.v4.media.a.h(5, "chatMode");
            h9.putLong("user_id", m1Var.getUserConfig().getClientUserId());
            h9.putString("quick_reply", o1Var.b);
            xn xnVar = new xn(h9);
            xnVar.nb(o1Var.a);
            m1Var.presentFragment(xnVar);
        }
    }

    public static void X(m1 m1Var) {
        m1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) m1Var.a, (h5.d) new ag.d(19));
        m1Var.actionBar.r();
        m1Var.a.w1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void d0(Activity activity, int i10, String str, o1 o1Var, g6 g6Var, Utilities.Callback callback) {
        ?? r32;
        p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z4 = R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        d2[] d2VarArr = new d2[1];
        AlertDialog$Builder g2Var = z4 ? new g2(activity, 0, g6Var) : new AlertDialog$Builder(activity, 0, g6Var);
        String string = LocaleController.getString((o1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        d2 d2Var = g2Var.a;
        d2Var.O = string;
        final g1 g1Var = new g1(activity, g6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        g1Var.setTextSize(1, 18.0f);
        g1Var.setText(o1Var == null ? str == null ? "" : str : o1Var.b);
        int i11 = k6.j5;
        g1Var.setTextColor(k6.v0(i11, g6Var));
        g1Var.setHintColor(k6.v0(k6.Xh, g6Var));
        g1Var.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        g1Var.setSingleLine(true);
        g1Var.setFocusable(true);
        g1Var.setLineColors(k6.v0(k6.k6, g6Var), k6.v0(k6.l6, g6Var), k6.v0(k6.p7, g6Var));
        g1Var.setImeOptions(6);
        g1Var.setBackgroundDrawable(null);
        g1Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        g1Var.setFilters(new InputFilter[]{new h1()});
        LinearLayout h9 = l.d.h(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((o1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, c6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.l(k6.q7, g6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, c6.e(-1, -2, 83));
        Runnable[] runnableArr = {new v9(r14, 24)};
        hg.c1 c1Var = new hg.c1(runnableArr, new ValueAnimator[1], textView2, textView, 16);
        g1Var.addTextChangedListener(new i1(textView2, runnableArr));
        h9.addView(frameLayout, c6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        h9.addView(g1Var, c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        g2Var.n(h9);
        d2Var.a = AndroidUtilities.dp(292.0f);
        g1Var.setOnEditorActionListener(new j1(g1Var, i10, o1Var, textView2, c1Var, callback, d2VarArr, currentFocus));
        g2Var.k(LocaleController.getString(R.string.Done), new n80(g1Var, c1Var, i10, o1Var, textView2, callback));
        g2Var.h(LocaleController.getString(R.string.Cancel), new sg.a(19));
        if (z4) {
            h = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new m(1, currentFocus));
            d2 d2Var2 = h;
            r32 = 0;
            final boolean z10 = false ? 1 : 0;
            d2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: vf.e1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (z10) {
                        case 0:
                            g1 g1Var2 = g1Var;
                            g1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var2);
                            break;
                        default:
                            g1 g1Var3 = g1Var;
                            g1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var3);
                            break;
                    }
                }
            });
            h.q(250L);
        } else {
            r32 = 0;
            d2Var.L = new org.telegram.ui.web.d1(g1Var, 22);
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new fg.d0(g1Var, 12));
            final int i12 = 1;
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: vf.e1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            g1 g1Var2 = g1Var;
                            g1Var2.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var2);
                            break;
                        default:
                            g1 g1Var3 = g1Var;
                            g1Var3.requestFocus();
                            AndroidUtilities.showKeyboard(g1Var3);
                            break;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[r32].e0 = r32;
        g1Var.setSelection(g1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new f1(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(k6.w0(null, k6.y8, false));
        j10.addView(this.c, c6.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new s2(1));
        org.telegram.ui.ActionBar.w0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        a61 a61Var = new a61(context, null, 5);
        a61Var.setBackgroundColor(k6.w0(null, k6.a7, false));
        final int i10 = 0;
        i61 i61Var = new i61(this, new Utilities.Callback2(this) { // from class: vf.c1
            public final /* synthetic */ m1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        m1.V(this.b, (ArrayList) obj, (x51) obj2);
                        break;
                    default:
                        m1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new d1(this), new d1(this));
        this.a = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.a;
        i61Var2.V2.r = false;
        final int i11 = 1;
        i61Var2.B1(new Utilities.Callback2(this) { // from class: vf.c1
            public final /* synthetic */ m1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        m1.V(this.b, (ArrayList) obj, (x51) obj2);
                        break;
                    default:
                        m1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        a61Var.addView(this.a, c6.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        this.fragmentView = a61Var;
        return a61Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i61 i61Var;
        x51 x51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (i61Var = this.a) == null || (x51Var = i61Var.V2) == null) {
            return;
        }
        x51Var.N(true);
    }

    public final void e0(j51 j51Var, View view) {
        o1 o1Var = (o1) j51Var.G;
        l1 l1Var = (l1) view;
        Integer valueOf = Integer.valueOf(o1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(o1Var.a));
        } else {
            arrayList.add(Integer.valueOf(o1Var.a));
        }
        this.a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(o1Var.a));
        j51Var.e = contains;
        l1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.c.a(Math.max(1, arrayList.size()), true);
        boolean z4 = arrayList.size() == 1;
        if (z4) {
            o1 c3 = p1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z4 = (c3 == null || p1.g(c3.b)) ? false : true;
        }
        if (this.f != z4) {
            this.f = z4;
            org.telegram.ui.b.p(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), pr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        p1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
