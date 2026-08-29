package sf;

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
import i7.f6;
import java.util.ArrayList;
import java.util.Collections;
import lh.o5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d80;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public static c2 h;
    public u51 a;
    public final ArrayList b;
    public NumberTextView c;
    public org.telegram.ui.ActionBar.w0 d;
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
                if (((w41) arrayList.get(i11)).G instanceof r1) {
                    ((r1) ((w41) arrayList.get(i11)).G).c = i11;
                }
            }
            s1 f9 = s1.f(n1Var.currentAccount);
            ArrayList arrayList2 = f9.b;
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < arrayList2.size(); i12 = th.d(((r1) arrayList2.get(i12)).a, i12, 1, arrayList3)) {
            }
            Collections.sort(arrayList2, new wp0(23));
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (((r1) arrayList2.get(i13)).a != ((Integer) arrayList3.get(i13)).intValue()) {
                    TLRPC.TL_messages_reorderQuickReplies tL_messages_reorderQuickReplies = new TLRPC.TL_messages_reorderQuickReplies();
                    for (int i14 = 0; i14 < arrayList2.size(); i14 = th.d(((r1) arrayList2.get(i14)).a, i14, 1, tL_messages_reorderQuickReplies.order)) {
                    }
                    ConnectionsManager.getInstance(f9.a).sendRequest(tL_messages_reorderQuickReplies, new o5(19));
                    f9.l();
                    return;
                }
            }
        }
    }

    public static void V(n1 n1Var, ArrayList arrayList, k51 k51Var) {
        String string = LocaleController.getString(R.string.BusinessReplies);
        String string2 = LocaleController.getString(R.string.BusinessRepliesInfo);
        w41 w41Var = new w41(2);
        w41Var.l = string;
        w41Var.o = string2;
        w41Var.m = "RestrictedEmoji";
        w41Var.n = "📝";
        arrayList.add(w41Var);
        k51Var.U();
        s1 f9 = s1.f(n1Var.currentAccount);
        ArrayList arrayList2 = f9.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i11 = (i11 != 0 || "hello".equalsIgnoreCase(((r1) arrayList2.get(i13)).b)) ? 1 : 0;
            i12 = (i12 != 0 || "away".equalsIgnoreCase(((r1) arrayList2.get(i13)).b)) ? 1 : 0;
            if (i11 != 0 && i12 != 0) {
                break;
            }
        }
        if (arrayList2.size() + (i11 ^ 1) + (i12 ^ 1) < MessagesController.getInstance(f9.a).quickRepliesLimit) {
            w41 c3 = w41.c(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd));
            c3.q = true;
            arrayList.add(c3);
        }
        n1Var.e = k51Var.M();
        ArrayList arrayList3 = s1.f(n1Var.currentAccount).b;
        int size = arrayList3.size();
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            r1 r1Var = (r1) obj;
            w41 w41Var2 = new w41(16);
            w41Var2.G = r1Var;
            w41Var2.K(n1Var.b.contains(Integer.valueOf(r1Var.a)));
            arrayList.add(w41Var2);
        }
        k51Var.L();
        k51Var.T();
        th.A(R.string.BusinessRepliesAddInfo, arrayList);
    }

    public static void W(n1 n1Var, w41 w41Var, View view) {
        if (w41Var.d == 1) {
            d0(n1Var.getParentActivity(), n1Var.currentAccount, null, null, n1Var.getResourceProvider(), new nh.b0(n1Var, 21));
            return;
        }
        if (w41Var.a == 16 && (w41Var.G instanceof r1)) {
            if (!n1Var.b.isEmpty()) {
                n1Var.e0(w41Var, view);
                return;
            }
            r1 r1Var = (r1) w41Var.G;
            if (r1Var.g) {
                return;
            }
            Bundle h10 = a4.w.h(5, "chatMode");
            h10.putLong("user_id", n1Var.getUserConfig().getClientUserId());
            h10.putString("quick_reply", r1Var.b);
            tn tnVar = new tn(h10);
            tnVar.nb(r1Var.a);
            n1Var.presentFragment(tnVar);
        }
    }

    public static void X(n1 n1Var) {
        n1Var.b.clear();
        AndroidUtilities.forEachViews((RecyclerView) n1Var.a, (f5.d) new l4.x0(17));
        n1Var.actionBar.r();
        n1Var.a.w1(false);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void d0(Activity activity, int i10, String str, r1 r1Var, c6 c6Var, Utilities.Callback callback) {
        ?? r32;
        o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(activity);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof hv0) && ((hv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        c2[] c2VarArr = new c2[1];
        AlertDialog$Builder f2Var = z10 ? new f2(activity, 0, c6Var) : new AlertDialog$Builder(activity, 0, c6Var);
        String string = LocaleController.getString((r1Var == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle);
        c2 c2Var = f2Var.a;
        c2Var.N = string;
        final h1 h1Var = new h1(activity, c6Var);
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        h1Var.setTextSize(1, 18.0f);
        h1Var.setText(r1Var == null ? str == null ? "" : str : r1Var.b);
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
        LinearLayout f9 = x3.f(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        TextView textView = new TextView(activity);
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString((r1Var == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, f6.e(-1, -2, 83));
        TextView textView2 = new TextView(activity);
        org.telegram.ui.b.m(g6.q7, c6Var, textView2, 1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, f6.e(-1, -2, 83));
        Runnable[] runnableArr = {new org.telegram.ui.web.t1(r14, 20)};
        eg.d1 d1Var = new eg.d1(runnableArr, new ValueAnimator[1], textView2, textView, 16);
        h1Var.addTextChangedListener(new j1(textView2, runnableArr));
        f9.addView(frameLayout, f6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f9.addView(h1Var, f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(f9);
        c2Var.a = AndroidUtilities.dp(292.0f);
        h1Var.setOnEditorActionListener(new k1(h1Var, i10, r1Var, textView2, d1Var, callback, c2VarArr, currentFocus));
        f2Var.k(LocaleController.getString(R.string.Done), new d80(h1Var, d1Var, i10, r1Var, textView2, callback));
        f2Var.h(LocaleController.getString(R.string.Cancel), new r.a(28));
        if (z10) {
            h = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new n(1, currentFocus));
            c2 c2Var2 = h;
            r32 = 0;
            final boolean z11 = false ? 1 : 0;
            c2Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: sf.e1
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
            c2Var.K = new nh.b0(h1Var, 22);
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new cg.d0(h1Var, 12));
            final int i12 = 1;
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: sf.e1
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
            c2VarArr[0].show();
        }
        c2VarArr[r32].d0 = r32;
        h1Var.setSelection(h1Var.getText().length());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new g1(this));
        org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(getParentActivity());
        this.c = numberTextView;
        numberTextView.setTextSize(18);
        this.c.setTypeface(AndroidUtilities.bold());
        this.c.setTextColor(g6.w0(null, g6.y8, false));
        j10.addView(this.c, f6.m(1.0f, 0, -1, 72, 0, 0));
        this.c.setOnTouchListener(new mh.d(2));
        org.telegram.ui.ActionBar.w0 a2 = j10.a(1, R.drawable.msg_edit);
        this.d = a2;
        a2.setContentDescription(LocaleController.getString(R.string.Edit));
        j10.a(2, R.drawable.msg_delete).setContentDescription(LocaleController.getString(R.string.Delete));
        n51 n51Var = new n51(context, null, 5);
        n51Var.setBackgroundColor(g6.w0(null, g6.a7, false));
        final int i10 = 0;
        u51 u51Var = new u51(this, new Utilities.Callback2(this) { // from class: sf.c1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        n1.V(this.b, (ArrayList) obj, (k51) obj2);
                        break;
                    default:
                        n1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, new d1(this), new d1(this));
        this.a = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.a;
        u51Var2.U2.r = false;
        final int i11 = 1;
        u51Var2.B1(new Utilities.Callback2(this) { // from class: sf.c1
            public final /* synthetic */ n1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        n1.V(this.b, (ArrayList) obj, (k51) obj2);
                        break;
                    default:
                        n1.U(this.b, ((Integer) obj).intValue(), (ArrayList) obj2);
                        break;
                }
            }
        }, false);
        n51Var.addView(this.a, f6.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        this.fragmentView = n51Var;
        return n51Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        k51 k51Var;
        if (i10 != NotificationCenter.quickRepliesUpdated || (u51Var = this.a) == null || (k51Var = u51Var.U2) == null) {
            return;
        }
        k51Var.N(true);
    }

    public final void e0(w41 w41Var, View view) {
        r1 r1Var = (r1) w41Var.G;
        m1 m1Var = (m1) view;
        Integer valueOf = Integer.valueOf(r1Var.a);
        ArrayList arrayList = this.b;
        if (arrayList.contains(valueOf)) {
            arrayList.remove(Integer.valueOf(r1Var.a));
        } else {
            arrayList.add(Integer.valueOf(r1Var.a));
        }
        this.a.w1(!arrayList.isEmpty());
        boolean contains = arrayList.contains(Integer.valueOf(r1Var.a));
        w41Var.e = contains;
        m1Var.d.a(contains, true);
        if (this.actionBar.s() == arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                this.actionBar.r();
            } else {
                this.actionBar.O(null, null);
            }
        }
        this.c.a(Math.max(1, arrayList.size()), true);
        boolean z10 = arrayList.size() == 1;
        if (z10) {
            r1 c3 = s1.f(this.currentAccount).c(((Integer) arrayList.get(0)).intValue());
            z10 = (c3 == null || s1.g(c3.b)) ? false : true;
        }
        if (this.f != z10) {
            this.f = z10;
            org.telegram.ui.b.q(this.d.animate().alpha(this.f ? 1.0f : 0.0f).scaleX(this.f ? 1.0f : 0.7f).scaleY(this.f ? 1.0f : 0.7f), jr.h, 340L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        s1.f(this.currentAccount).h();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
