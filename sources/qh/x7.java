package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class x7 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final td0 B;
    public boolean C;
    public org.telegram.ui.ActionBar.d2 D;
    public long E;
    public String F;
    public final ArrayList G;
    public final ArrayList H;
    public final ArrayList I;
    public boolean J;
    public boolean K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public final /* synthetic */ d8 T;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final tl0 f;
    public final f2.j0 h;
    public final t7 n;
    public final v7 r;
    public final View s;
    public final d v;
    public final d w;
    public final r7 x;
    public final org.telegram.ui.Cells.u3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(d8 d8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var6;
        org.telegram.ui.ActionBar.g6 g6Var7;
        org.telegram.ui.ActionBar.g6 g6Var8;
        org.telegram.ui.ActionBar.g6 g6Var9;
        this.T = d8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.O = -1;
        g6Var = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, g6Var);
        this.y = u3Var;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        r7 r7Var = new r7(this, context, g6Var2, new p7(this, 4));
        this.x = r7Var;
        int i12 = org.telegram.ui.ActionBar.k6.h5;
        r7Var.setBackgroundColor(d8Var.getThemedColor(i12));
        r7Var.setOnSearchTextChange(new q7(this, 3));
        g6Var3 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        td0 td0Var = new td0(context, g6Var3);
        this.B = td0Var;
        td0Var.h = new p7(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        g6Var4 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        tl0 tl0Var = new tl0(context, g6Var4);
        this.f = tl0Var;
        tl0Var.setClipToPadding(false);
        tl0Var.setTranslateSelector(true);
        g6Var5 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        t7 t7Var = new t7(this, context, g6Var5, r7Var, new oh.v3(d8Var, 2));
        this.n = t7Var;
        tl0Var.setAdapter(t7Var);
        t7Var.h = tl0Var;
        f2.j0 j0Var = new f2.j0();
        this.h = j0Var;
        tl0Var.setLayoutManager(j0Var);
        tl0Var.setOnScrollListener(new org.telegram.ui.l6(this, 2));
        tl0Var.setOnItemClickListener(new org.telegram.ui.web.m(3, this, context));
        frameLayout.addView(tl0Var, k7.c6.c(-1.0f, -1));
        s7 s7Var = new s7(this);
        s7Var.n(350L);
        s7Var.o(pr.h);
        s7Var.C = false;
        s7Var.m = false;
        tl0Var.setItemAnimator(s7Var);
        frameLayout.addView(r7Var, k7.c6.e(-1, -2, 55));
        frameLayout.addView(u3Var, k7.c6.e(-1, 32, 55));
        addView(td0Var, k7.c6.e(-1, -2, 55));
        v7 v7Var = new v7(this, context);
        this.r = v7Var;
        v7Var.setClickable(true);
        v7Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) d8Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.h3) d8Var).backgroundPaddingLeft;
        v7Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        g6Var6 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        v7Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var6));
        g6Var7 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        d dVar = new d(context, g6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new o7(this, 0));
        dVar.e();
        v7Var.addView(dVar, k7.c6.q(-1, 48, 87));
        g6Var8 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        d dVar2 = new d(context, g6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new o7(this, 1));
        dVar2.e();
        v7Var.addView(dVar2, k7.c6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        g6Var9 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var9));
        addView(view, k7.c6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(v7Var, k7.c6.e(-1, -2, 87));
    }

    public final void a(boolean z4) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) this.T).currentAccount;
        arrayList.addAll(MessagesController.getInstance(i10).getStoriesController().L);
        int i11 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i11 >= hVar.m()) {
                break;
            }
            long j10 = hVar.j(i11);
            if (!((Boolean) hVar.n(i11)).booleanValue()) {
                arrayList.remove(Long.valueOf(j10));
            } else if (!arrayList.contains(Long.valueOf(j10))) {
                arrayList.add(Long.valueOf(j10));
            }
            i11++;
        }
        if (z4) {
            g(true);
            e(true);
            f(true);
        }
    }

    public final void b(int i10) {
        this.a = i10;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        d8 d8Var = this.T;
        if (i10 == 4) {
            arrayList.addAll(d8Var.d);
            hashMap.putAll(d8Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(d8Var.G);
        } else if (i10 == 1) {
            ArrayList J0 = d8.J0(d8Var);
            for (int i11 = 0; i11 < J0.size(); i11 = android.support.v4.media.a.g(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(d8Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(d8Var.n);
            hashMap.putAll(d8Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        r7 r7Var = this.x;
        r7Var.setText("");
        r7Var.setVisibility(i10 == 0 ? 8 : 0);
        r7Var.H = true;
        this.F = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        tl0 tl0Var = this.f;
        if (i12 != 0) {
            tl0Var.u0(0);
        }
        tl0Var.requestLayout();
        this.O = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -l.d.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.G), 0);
        while (true) {
            tl0 tl0Var = this.f;
            if (i10 >= tl0Var.getChildCount()) {
                return f10;
            }
            View childAt = tl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z4 = i11 == 1 || i11 == 2;
        d8 d8Var = this.T;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
                if (user != null && !UserObject.isUserSelf(user) && !user.bot && user.id != 777000 && j11 != 0) {
                    if (!z4 || user.contact) {
                        arrayList.add(Long.valueOf(j11));
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    this.c.remove(Long.valueOf(j11));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j10), arrayList);
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            i(true);
            e(true);
            f(true);
            this.x.H = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            g6Var2 = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var2);
            alertDialog$Builder.a.Q = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        g6Var = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, g6Var);
        alertDialog$Builder2.a.Q = arrayList2.size() + " members are not in your contact list";
        alertDialog$Builder2.k("Add " + arrayList.size() + " contacts", new e3.f(this, j10, arrayList, 10));
        alertDialog$Builder2.h("Cancel", null);
        alertDialog$Builder2.o();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.d2 d2Var;
        if (i10 != NotificationCenter.chatInfoDidLoad || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (d2Var = this.D) == null || this.E != chatFull.id) {
            return;
        }
        d2Var.c(350L);
        this.D = null;
        this.E = -1L;
        d(chatFull.id, chatFull.participants);
    }

    public final void e(boolean z4) {
        int i10;
        int i11 = this.a;
        d8 d8Var = this.T;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z4);
            if (d8Var.I) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else if (d8Var.W) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else {
                int i13 = d8Var.F;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(d8Var.H ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z4, true);
                } else {
                    dVar2.g(LocaleController.formatPluralStringComma("StoryPrivacyButtonPostMultiple", i13), z4, true);
                }
            }
            dVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i11 == 1) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z4, true);
            dVar2.c(arrayList.size(), z4);
            dVar.setVisibility(8);
            return;
        }
        v7 v7Var = this.r;
        if (i11 == 3) {
            int size = d8.l1(arrayList, this.d).size();
            d8Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            v7Var.b(size <= 0, z4);
            dVar2.c(size, z4);
            dVar2.setEnabled(size > 0);
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 2) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
                dVar2.c(0, z4);
            } else {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonExcludeContacts), z4, true);
                dVar2.c(arrayList.size(), z4);
            }
            dVar.setVisibility(8);
            return;
        }
        if (i11 == 5) {
            dVar2.setShowZero(true);
            dVar2.setEnabled(!arrayList.isEmpty());
            dVar2.c(arrayList.size(), z4);
            dVar.setVisibility(8);
            return;
        }
        if (i11 != 6) {
            if (i11 == 4) {
                int size2 = d8.l1(d8Var.d, d8Var.e).size();
                d8Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
                dVar2.setShowZero(false);
                v7Var.b(false, z4);
                dVar2.c(size2, z4);
                dVar2.setEnabled(true);
                dVar.setVisibility(8);
                return;
            }
            return;
        }
        dVar2.setShowZero(false);
        dVar2.setEnabled(true);
        dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSaveCloseFriends), z4, true);
        i10 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
        oh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
        if (!storiesController.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i12 >= hVar.m()) {
                    break;
                }
                long j10 = hVar.j(i12);
                ((Boolean) hVar.n(i12)).getClass();
                storiesController.L.contains(Long.valueOf(j10));
                i12++;
            }
        } else {
            dVar2.c(arrayList.size(), z4);
        }
        dVar.setVisibility(8);
    }

    public final void f(boolean z4) {
        ArrayList arrayList;
        int R;
        d8 d8Var = this.T;
        ArrayList arrayList2 = d8Var.G;
        HashMap hashMap = d8Var.r;
        ArrayList arrayList3 = d8Var.n;
        ArrayList arrayList4 = d8Var.h;
        HashMap hashMap2 = d8Var.e;
        ArrayList arrayList5 = d8Var.d;
        int i10 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i10 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i10 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i10 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i10 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (d8Var.K != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.O;
                if (i11 != -1) {
                    d8Var.K = i11;
                }
            } else {
                this.O = d8Var.K;
                d8Var.K = 3;
            }
        }
        HashSet l1 = d8.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.I;
            if (i12 >= arrayList.size()) {
                break;
            }
            n7 n7Var = (n7) arrayList.get(i12);
            if (n7Var != null) {
                int i13 = n7Var.i;
                if (i13 > 0) {
                    n7Var.k = d8Var.K == i13;
                    n7Var.l = false;
                } else {
                    TLRPC.User user = n7Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        n7Var.k = contains;
                        n7Var.l = !contains && l1.contains(Long.valueOf(n7Var.g.id));
                    } else {
                        TLRPC.Chat chat = n7Var.h;
                        if (chat != null) {
                            n7Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            n7Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            tl0 tl0Var = this.f;
            if (i14 >= tl0Var.getChildCount()) {
                h(z4);
                return;
            }
            View childAt = tl0Var.getChildAt(i14);
            if ((childAt instanceof c8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                n7 n7Var2 = (n7) arrayList.get(R);
                c8 c8Var = (c8) childAt;
                c8Var.c(n7Var2.k || n7Var2.l, z4);
                TLRPC.Chat chat2 = n7Var2.h;
                if (chat2 != null) {
                    c8Var.b(d8.d1(d8Var, chat2) > 200 ? 0.3f : 1.0f, z4);
                } else {
                    if (n7Var2.l && !n7Var2.k) {
                        r8 = 0.5f;
                    }
                    c8Var.b(r8, z4);
                }
            }
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0498  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z4) {
        float dp;
        float dp2;
        t7 t7Var;
        boolean z10;
        int i10;
        float dp3;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean containsKey;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        int i16;
        int i17;
        int i18;
        String formatPluralString;
        float f10;
        boolean z17;
        n7 n7Var;
        boolean z18;
        String formatPluralString2;
        int i19;
        long clientUserId;
        n7 n7Var2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        d8 d8Var = this.T;
        ArrayList arrayList = d8Var.n;
        ArrayList arrayList2 = d8Var.d;
        ArrayList arrayList3 = d8Var.h;
        HashSet hashSet = d8Var.v;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        ArrayList arrayList5 = this.I;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (i26 != 0) {
            td0 td0Var = this.B;
            if (i26 == 1) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                td0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 2) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                td0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 3) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                td0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 5) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                td0Var.d(d8Var.L);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 6) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                td0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 4) {
                td0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                td0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) td0Var.e).c(0.0f, false);
                arrayList5.add(n7.d());
                arrayList5.add(n7.c());
                arrayList5.size();
                arrayList5.add(n7.e());
                arrayList5.add(n7.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                u3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z4);
                this.C = true;
                boolean isEmpty = TextUtils.isEmpty(this.F);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.F).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? d8.Y0(d8Var) : d8.Z0(d8Var, i27 == 1 || i27 == 2, d8Var.V && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = d8.l1(arrayList6, hashMap);
                    ArrayList arrayList7 = this.G;
                    if (isEmpty) {
                        if (!z4) {
                            arrayList7.clear();
                            int i28 = 0;
                            while (i28 < Y0.size()) {
                                TLObject tLObject = (TLObject) Y0.get(i28);
                                if (tLObject instanceof TLRPC.User) {
                                    z14 = isEmpty;
                                    containsKey = arrayList6.contains(Long.valueOf(((TLRPC.User) tLObject).id));
                                } else {
                                    z14 = isEmpty;
                                    containsKey = tLObject instanceof TLRPC.Chat ? hashMap.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false;
                                }
                                if (containsKey) {
                                    arrayList7.add(tLObject);
                                }
                                i28++;
                                isEmpty = z14;
                            }
                        }
                        z10 = isEmpty;
                        int i29 = 0;
                        int i30 = 0;
                        while (i29 < arrayList7.size()) {
                            TLObject tLObject2 = (TLObject) arrayList7.get(i29);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList6.contains(Long.valueOf(user.id));
                                i12 = i29;
                                i13 = i30;
                                n7 i31 = n7.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
                                int i32 = this.a;
                                i31.m = i32 == 2 || i32 == 4;
                                arrayList5.add(i31);
                                dp += AndroidUtilities.dp(56.0f);
                            } else {
                                i12 = i29;
                                i13 = i30;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey2 = hashMap.containsKey(Long.valueOf(chat.id));
                                    float f11 = dp;
                                    n7 n7Var3 = new n7(3, true);
                                    n7Var3.h = chat;
                                    n7Var3.k = containsKey2;
                                    int i33 = this.a;
                                    n7Var3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(n7Var3);
                                    dp = f11 + AndroidUtilities.dp(56.0f);
                                } else {
                                    i30 = i13;
                                    i29 = i12 + 1;
                                }
                            }
                            i30 = i13 + 1;
                            i29 = i12 + 1;
                        }
                        i10 = i30;
                    } else {
                        z10 = isEmpty;
                        i10 = 0;
                    }
                    int i34 = 0;
                    while (i34 < Y0.size()) {
                        TLObject tLObject3 = (TLObject) Y0.get(i34);
                        if (z10 && arrayList7.contains(tLObject3)) {
                            i11 = i34;
                        } else {
                            if (!TextUtils.isEmpty(lowerCase)) {
                                if (tLObject3 instanceof TLRPC.User) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                                    String lowerCase2 = AndroidUtilities.translitSafe(UserObject.getUserName(user2)).toLowerCase();
                                    if (!lowerCase2.startsWith(lowerCase) && !org.telegram.messenger.y3.w(" ", lowerCase, lowerCase2)) {
                                        String lowerCase3 = AndroidUtilities.translitSafe(UserObject.getPublicUsername(user2)).toLowerCase();
                                        if (!lowerCase3.startsWith(lowerCase) && !org.telegram.messenger.y3.w(" ", lowerCase, lowerCase3)) {
                                            ArrayList<TLRPC.TL_username> arrayList8 = user2.usernames;
                                            if (arrayList8 != null) {
                                                int i35 = 0;
                                                while (i35 < arrayList8.size()) {
                                                    TLRPC.TL_username tL_username = arrayList8.get(i35);
                                                    i11 = i34;
                                                    if (tL_username.active && AndroidUtilities.translitSafe(tL_username.username).toLowerCase().startsWith(lowerCase)) {
                                                        z12 = true;
                                                        break;
                                                    } else {
                                                        i35++;
                                                        i34 = i11;
                                                    }
                                                }
                                            }
                                            i11 = i34;
                                            z12 = false;
                                        }
                                    }
                                } else {
                                    i11 = i34;
                                    if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                        String lowerCase4 = AndroidUtilities.translitSafe(chat2.title).toLowerCase();
                                        if (!lowerCase4.startsWith(lowerCase) && !org.telegram.messenger.y3.w(" ", lowerCase, lowerCase4)) {
                                            String lowerCase5 = AndroidUtilities.translitSafe(ChatObject.getPublicUsername(chat2)).toLowerCase();
                                            if (!lowerCase5.startsWith(lowerCase) && !org.telegram.messenger.y3.w(" ", lowerCase, lowerCase5)) {
                                                ArrayList<TLRPC.TL_username> arrayList9 = chat2.usernames;
                                                if (arrayList9 != null) {
                                                    for (int i36 = 0; i36 < arrayList9.size(); i36++) {
                                                        TLRPC.TL_username tL_username2 = arrayList9.get(i36);
                                                        if (!tL_username2.active || !AndroidUtilities.translitSafe(tL_username2.username).toLowerCase().startsWith(lowerCase)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z12 = true;
                                        break;
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    if (tLObject3 instanceof TLRPC.User) {
                                        TLRPC.User user3 = (TLRPC.User) tLObject3;
                                        boolean contains2 = arrayList6.contains(Long.valueOf(user3.id));
                                        n7 i37 = n7.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        n7 n7Var4 = new n7(3, true);
                                        n7Var4.h = chat3;
                                        n7Var4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z13 = false;
                                            n7Var4.m = z13;
                                            arrayList5.add(n7Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z13 = true;
                                        n7Var4.m = z13;
                                        arrayList5.add(n7Var4);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                        i34 = i11 + 1;
                                    }
                                }
                            }
                            i11 = i34;
                            z12 = true;
                            if (z12) {
                            }
                        }
                        i34 = i11 + 1;
                    }
                    if (!z10) {
                        if (i10 == 0) {
                            arrayList5.add(new n7(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        tl0 tl0Var = this.f;
                        if (tl0Var != null) {
                            int measuredHeight = (tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop()) - tl0Var.getPaddingBottom();
                            z11 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                            dp3 = measuredHeight + (z11 ? this.Q : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f12 = dp3 - dp;
                        if (f12 > 0.0f) {
                            n7 n7Var5 = new n7(-1, false);
                            n7Var5.p = (int) f12;
                            arrayList5.add(n7Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                t7Var = this.n;
                if (t7Var != null) {
                    if (!z4 || d8Var.K == 0) {
                        t7Var.l();
                    } else {
                        t7Var.E(arrayList4, arrayList5);
                    }
                }
                this.e.invalidate();
            }
            dp = dp2;
            boolean isEmpty2 = TextUtils.isEmpty(this.F);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            t7Var = this.n;
            if (t7Var != null) {
            }
            this.e.invalidate();
        }
        this.C = false;
        u3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        n7 n7Var6 = new n7(-1, false);
        n7Var6.o = 24;
        arrayList5.add(n7Var6);
        if (d8Var.I) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            n7 n7Var7 = new n7(11, false);
            n7Var7.e = string;
            arrayList5.add(n7Var7);
            n7Var6.o = AndroidUtilities.dp(72.0f) + n7Var6.o;
        } else if (d8Var.C && (d8Var.W || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = d8Var.W ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(d8Var.H ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (d8Var.H) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = d8Var.N;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            n7 n7Var8 = new n7(4, false);
            n7Var8.e = string2;
            n7Var8.f = formatPluralString;
            arrayList5.add(n7Var8);
            n7Var6.o = AndroidUtilities.dp(72.0f) + n7Var6.o;
        } else {
            String string3 = LocaleController.getString(d8Var.H ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            n7 n7Var9 = new n7(8, false);
            n7Var9.e = string3;
            arrayList5.add(n7Var9);
            n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
            TLRPC.InputPeer inputPeer = d8Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                n7 i41 = n7.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                n7Var6.o = AndroidUtilities.dp(62.0f) + n7Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                n7 i42 = n7.i(MessagesController.getInstance(i18).getUser(Long.valueOf(d8Var.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                n7Var6.o = AndroidUtilities.dp(62.0f) + n7Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(d8Var.c.channel_id));
                    n7 n7Var10 = new n7(3, true);
                    n7Var10.h = chat4;
                    n7Var10.k = false;
                    n7Var10.n = true;
                    arrayList5.add(n7Var10);
                    z16 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    n7Var6.o = AndroidUtilities.dp(104.0f) + n7Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(d8Var.c.chat_id));
                    n7 n7Var11 = new n7(3, true);
                    n7Var11.h = chat5;
                    n7Var11.k = false;
                    n7Var11.n = true;
                    arrayList5.add(n7Var11);
                    n7Var6.o = AndroidUtilities.dp(104.0f) + n7Var6.o;
                    z16 = false;
                }
                z15 = false;
                n7 g10 = n7.g(null);
                g10.c = !z15 ? 1 : 2;
                arrayList5.add(g10);
                n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
                if (z15) {
                    String string4 = LocaleController.getString(d8Var.H ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    n7 n7Var12 = new n7(8, false);
                    n7Var12.e = string4;
                    arrayList5.add(n7Var12);
                    n7Var6.o = AndroidUtilities.dp(40.0f) + n7Var6.o;
                }
                if (z15 || d8Var.I) {
                    f10 = 80.0f;
                } else {
                    n7 h = n7.h(4, d8Var.f, d8Var.K == 4);
                    arrayList5.add(h);
                    n7Var6.o = AndroidUtilities.dp(56.0f) + n7Var6.o;
                    f10 = 80.0f;
                    if (d8Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = d8Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    n7 h9 = n7.h(2, arrayList3.size(), d8Var.K == 2);
                    arrayList5.add(h9);
                    n7Var6.o = AndroidUtilities.dp(56.0f) + n7Var6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        h9.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = d8.J0(d8Var);
                    n7 h10 = n7.h(1, J0.size(), d8Var.K == 1);
                    arrayList5.add(h10);
                    n7Var6.o = AndroidUtilities.dp(56.0f) + n7Var6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) J0.get(0);
                    }
                    n7 h11 = n7.h(3, d8Var.s, d8Var.K == 3);
                    arrayList5.add(h11);
                    n7Var6.o = AndroidUtilities.dp(56.0f) + n7Var6.o;
                    if (d8Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = d8Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                                    h11.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                            h11.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(d8Var.H ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(d8Var.H ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.k6.gc;
                    p7 p7Var = new p7(this, 3);
                    g6Var = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
                    arrayList5.add(n7.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, p7Var, g6Var)));
                    n7Var6.o = AndroidUtilities.dp(80.0f) + n7Var6.o;
                }
                if (!d8Var.W) {
                    if (d8Var.H && !d8Var.I) {
                        if (d8Var.D) {
                            arrayList5.add(n7.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                            arrayList5.add(n7.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                            arrayList5.add(n7.g(null));
                            n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
                        } else {
                            arrayList5.add(n7.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                            arrayList5.add(n7.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            n7Var6.o = AndroidUtilities.dp(30.0f) + n7Var6.o;
                        }
                    }
                    if (d8Var.H) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z19 = d8Var.w;
                        n7 n7Var13 = new n7(7, false);
                        n7Var13.c = 2;
                        n7Var13.e = string6;
                        n7Var13.k = z19;
                        arrayList5.add(n7Var13);
                        n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                    }
                    if (!d8Var.I) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z20 = d8Var.x;
                        n7 n7Var14 = new n7(7, false);
                        n7Var14.c = 0;
                        n7Var14.e = string7;
                        n7Var14.k = z20;
                        arrayList5.add(n7Var14);
                        n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                    }
                    if (!d8Var.H && !d8Var.I) {
                        String string8 = LocaleController.getString(z15 ? R.string.StoryKeep : z16 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z21 = d8Var.y;
                        n7 n7Var15 = new n7(7, false);
                        n7Var15.c = 1;
                        n7Var15.e = string8;
                        n7Var15.k = z21;
                        arrayList5.add(n7Var15);
                        n7Var6.o = AndroidUtilities.dp(50.0f) + n7Var6.o;
                    }
                }
                z17 = d8Var.H;
                String str = "StoryKeepGroupInfo";
                if (!z17 || d8Var.I) {
                    arrayList5.add(n7.g(null));
                    n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
                } else if (!d8Var.W && d8Var.B && d8Var.Z != null) {
                    if (z17) {
                        formatPluralString3 = LocaleController.getString(z15 ? R.string.StoryLiveKeepInfo : z16 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z15 ? "StoryKeepInfo" : z16 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = d8Var.N;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(n7.g(formatPluralString3));
                    n7Var6.o = AndroidUtilities.dp(f10) + n7Var6.o;
                }
                if (d8Var.y || d8Var.H || d8Var.I) {
                    n7Var = n7Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = d8Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j10 = clientUserId;
                    d8Var.i1().B(j10, true);
                    StringBuilder sb = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        n7Var2 = n7Var6;
                    } else {
                        n7Var2 = n7Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                oh.m6 b10 = d8Var.i1().B(j10, true).b(((Integer) it3.next()).intValue());
                                if (b10 != null) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(b10.b);
                                }
                                it3 = it4;
                            }
                        } else {
                            sb.append(LocaleController.formatPluralString("StoriesAlbumCount", hashSet.size(), new Object[0]));
                        }
                    }
                    arrayList5.add(n7.b(LocaleController.getString(R.string.StoriesAlbum), sb, 1));
                    n7Var = n7Var2;
                    n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
                }
                if (!d8Var.W && ((!d8Var.B || d8Var.Z == null) && !(z18 = d8Var.H) && !d8Var.I)) {
                    if (z18) {
                        if (z15) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = d8Var.N;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z15 ? R.string.StoryLiveKeepInfo : z16 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(n7.g(formatPluralString2));
                    n7Var.o = AndroidUtilities.dp(f10) + n7Var.o;
                }
                if (d8Var.y && d8Var.B && d8Var.Z != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = d8Var.Y;
                    n7 n7Var16 = new n7(9, false);
                    n7Var16.e = string9;
                    n7Var16.d = bitmapDrawable;
                    n7Var16.q = 0;
                    arrayList5.add(n7Var16);
                    n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
                    arrayList5.add(n7.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    n7Var.o = AndroidUtilities.dp(72.0f) + n7Var.o;
                }
                if (d8Var.I) {
                    arrayList5.add(n7.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
                    arrayList5.add(n7.g(null));
                    n7Var.o = AndroidUtilities.dp(52.0f) + n7Var.o;
                }
                if (d8Var.H && d8Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    n7 n7Var17 = new n7(8, false);
                    n7Var17.e = string10;
                    arrayList5.add(n7Var17);
                    n7Var.o = AndroidUtilities.dp(40.0f) + n7Var.o;
                    n7 n7Var18 = new n7(10, false);
                    n7Var18.q = 8;
                    arrayList5.add(n7Var18);
                    n7Var.o = AndroidUtilities.dp(75.0f) + n7Var.o;
                    arrayList5.add(n7.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
                }
            }
            z16 = false;
            z15 = true;
            n7 g102 = n7.g(null);
            g102.c = !z15 ? 1 : 2;
            arrayList5.add(g102);
            n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
            if (z15) {
            }
            if (z15) {
            }
            f10 = 80.0f;
            if (!d8Var.W) {
            }
            z17 = d8Var.H;
            String str3 = "StoryKeepGroupInfo";
            if (z17) {
            }
            arrayList5.add(n7.g(null));
            n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
            if (d8Var.y) {
            }
            n7Var = n7Var6;
            if (!d8Var.W) {
                if (z18) {
                }
                arrayList5.add(n7.g(formatPluralString2));
                n7Var.o = AndroidUtilities.dp(f10) + n7Var.o;
            }
            if (d8Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = d8Var.Y;
                n7 n7Var162 = new n7(9, false);
                n7Var162.e = string92;
                n7Var162.d = bitmapDrawable2;
                n7Var162.q = 0;
                arrayList5.add(n7Var162);
                n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
                arrayList5.add(n7.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                n7Var.o = AndroidUtilities.dp(72.0f) + n7Var.o;
            }
            if (d8Var.I) {
            }
            if (d8Var.H) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                n7 n7Var172 = new n7(8, false);
                n7Var172.e = string102;
                arrayList5.add(n7Var172);
                n7Var.o = AndroidUtilities.dp(40.0f) + n7Var.o;
                n7 n7Var182 = new n7(10, false);
                n7Var182.q = 8;
                arrayList5.add(n7Var182);
                n7Var.o = AndroidUtilities.dp(75.0f) + n7Var.o;
                arrayList5.add(n7.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                n7Var.o = AndroidUtilities.dp(50.0f) + n7Var.o;
            }
        }
        z16 = false;
        z15 = true;
        if (z15) {
        }
        f10 = 80.0f;
        if (!d8Var.W) {
        }
        z17 = d8Var.H;
        String str32 = "StoryKeepGroupInfo";
        if (z17) {
        }
        arrayList5.add(n7.g(null));
        n7Var6.o = AndroidUtilities.dp(12.0f) + n7Var6.o;
        if (d8Var.y) {
        }
        n7Var = n7Var6;
        if (!d8Var.W) {
        }
        if (d8Var.y) {
        }
        if (d8Var.I) {
        }
        if (d8Var.H) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.F);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        t7Var = this.n;
        if (t7Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z4) {
        org.telegram.ui.Cells.u3 u3Var = this.y;
        if (u3Var == null) {
            return;
        }
        if (d8.l1(this.c, this.d).size() > 0) {
            u3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new o7(this, 2));
            return;
        }
        if (z4) {
            u3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = u3Var.b;
        t3Var.c(null, false, true);
        t3Var.setOnClickListener(null);
        t3Var.setVisibility(0);
    }

    public final void i(boolean z4) {
        int i10;
        r7 r7Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.g6 g6Var;
        HashSet l1 = d8.l1(this.c, this.d);
        int i11 = this.a;
        d8 d8Var = this.T;
        if (i11 == 3) {
            d8Var.s = l1.size();
        } else if (i11 == 4) {
            d8Var.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            r7Var = this.x;
            ArrayList arrayList4 = r7Var.d;
            arrayList = r7Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            p30 p30Var = (p30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(p30Var.getUid()))) {
                arrayList2.add(p30Var);
            }
            i13++;
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    Object user = longValue >= 0 ? messagesController.getUser(l10) : messagesController.getChat(l10);
                    if (user != null) {
                        Context context = getContext();
                        g6Var = ((org.telegram.ui.ActionBar.h3) d8Var).resourcesProvider;
                        p30 p30Var2 = new p30(context, user, null, true, g6Var);
                        p30Var2.setOnClickListener(this);
                        arrayList3.add(p30Var2);
                    }
                } else if (((p30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        lg.j jVar = r7Var.c;
        ArrayList arrayList5 = jVar.e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f;
        a8 a8Var = (a8) jVar.n;
        a8Var.D = true;
        ArrayList arrayList8 = a8Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((p30) arrayList2.get(i15)).setOnClickListener(null);
        }
        jVar.c();
        if (z4) {
            jVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.b = animatorSet;
            animatorSet.addListener(new z7(jVar, arrayList2, i12));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i16 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i16 >= size) {
                    break;
                }
                p30 p30Var3 = (p30) arrayList2.get(i16);
                arrayList5.add(p30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(p30Var3, (Property<p30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(p30Var3, (Property<p30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(p30Var3, (Property<p30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                p30 p30Var4 = (p30) arrayList3.get(i17);
                arrayList6.add(p30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(p30Var4, (Property<p30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(p30Var4, (Property<p30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(p30Var4, (Property<p30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                jVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            jVar.b = null;
            jVar.c = false;
            a8Var.a.setAllowDrawCursor(true);
        }
        while (i12 < arrayList3.size()) {
            jVar.addView((View) arrayList3.get(i12));
            i12++;
        }
        jVar.requestLayout();
    }

    public final void j() {
        float c3 = c();
        boolean z4 = this.J;
        boolean z10 = false;
        r7 r7Var = this.x;
        if (z4 || this.R || getTranslationX() != 0.0f) {
            this.K = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            r7Var.setTranslationY(c3);
        } else if (!this.K || Math.abs(this.L - c3) > 1.0f) {
            this.K = true;
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.M = null;
            }
            float translationY = r7Var.getTranslationY();
            this.L = c3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c3);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 22));
            this.M.addListener(new j2(this, 5));
            this.M.setInterpolator(new LinearInterpolator());
            this.M.setDuration(180L);
            this.M.start();
        }
        boolean z11 = this.C;
        td0 td0Var = this.B;
        if (!z11) {
            td0Var.setVisibility(8);
            return;
        }
        td0Var.setVisibility(0);
        float f10 = -td0Var.getHeight();
        int i10 = 0;
        while (true) {
            tl0 tl0Var = this.f;
            if (i10 >= tl0Var.getChildCount()) {
                z10 = true;
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.N != z10) {
            this.N = z10;
            ((org.telegram.ui.ActionBar.i2) td0Var.e).c((z10 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        td0Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.T).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r7 r7Var = this.x;
        if (!r7Var.d.contains(view)) {
            return;
        }
        p30 p30Var = (p30) view;
        if (!p30Var.y) {
            p30 p30Var2 = r7Var.e;
            if (p30Var2 != null) {
                p30Var2.a();
                r7Var.e = null;
            }
            r7Var.e = p30Var;
            p30Var.b();
            return;
        }
        r7Var.e = null;
        lg.j jVar = r7Var.c;
        a8 a8Var = (a8) jVar.n;
        a8Var.D = true;
        a8Var.d.remove(p30Var);
        p30Var.setOnClickListener(null);
        jVar.c();
        jVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        jVar.b = animatorSet;
        animatorSet.addListener(new fx0(18, jVar, p30Var));
        ArrayList arrayList = jVar.h;
        arrayList.clear();
        arrayList.add(p30Var);
        ArrayList arrayList2 = jVar.d;
        arrayList2.clear();
        jVar.e.clear();
        arrayList2.add(p30Var);
        ArrayList arrayList3 = jVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(p30Var, (Property<p30, Float>) View.ALPHA, 1.0f, 0.0f));
        jVar.requestLayout();
        long uid = p30Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                f(true);
                e(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.T).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i13;
        d8 d8Var = this.T;
        i12 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardHeight;
            this.Q = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z16 = this.S;
        z4 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
        tl0 tl0Var = this.f;
        v7 v7Var = this.r;
        if (z16 != z4) {
            float c3 = c();
            z10 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
            int i14 = 2;
            if (z10 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.x.G) > tl0Var.getPaddingTop()) {
                xh.o oVar = new xh.o(getContext(), 2, 0.7f);
                oVar.a = 1;
                oVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z14 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                v7Var.setTranslationY(z14 ? this.Q : 0.0f);
                z15 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                view.setTranslationY(z15 ? this.Q : 0.0f);
            } else {
                z11 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                float f10 = z11 ? this.Q : -this.Q;
                ValueAnimator valueAnimator = v7Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    v7Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                v7Var.d = ofFloat;
                ofFloat.addUpdateListener(new u7(v7Var, 1));
                v7Var.d.addListener(new j2(v7Var, 6));
                v7Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = v7Var.d;
                pr prVar = org.telegram.ui.ActionBar.r1.w;
                valueAnimator2.setInterpolator(prVar);
                v7Var.d.start();
                z12 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                view.setTranslationY(z12 ? this.Q : -this.Q);
                this.R = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(prVar).withEndAction(new p7(this, i14)).start();
            }
            z13 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
            this.S = z13;
        }
        tl0Var.setPadding(0, 0, 0, v7Var.getMeasuredHeight());
    }
}
