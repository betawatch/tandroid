package ph;

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
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sd0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y7 extends FrameLayout implements View.OnClickListener, NotificationCenter.NotificationCenterDelegate {
    public final sd0 B;
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
    public final /* synthetic */ e8 T;
    public int a;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final rl0 f;
    public final f2.i0 h;
    public final u7 n;
    public final w7 r;
    public final View s;
    public final d v;
    public final d w;
    public final s7 x;
    public final org.telegram.ui.Cells.t3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(e8 e8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var6;
        org.telegram.ui.ActionBar.f6 f6Var7;
        org.telegram.ui.ActionBar.f6 f6Var8;
        org.telegram.ui.ActionBar.f6 f6Var9;
        this.T = e8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.O = -1;
        f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, f6Var);
        this.y = t3Var;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        s7 s7Var = new s7(this, context, f6Var2, new q7(this, 4));
        this.x = s7Var;
        int i12 = org.telegram.ui.ActionBar.j6.h5;
        s7Var.setBackgroundColor(e8Var.getThemedColor(i12));
        s7Var.setOnSearchTextChange(new r7(this, 3));
        f6Var3 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        sd0 sd0Var = new sd0(context, f6Var3);
        this.B = sd0Var;
        sd0Var.h = new q7(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, k7.b6.e(-1, -1, 119));
        f6Var4 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        rl0 rl0Var = new rl0(context, f6Var4);
        this.f = rl0Var;
        rl0Var.setClipToPadding(false);
        rl0Var.setTranslateSelector(true);
        f6Var5 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        u7 u7Var = new u7(this, context, f6Var5, s7Var, new nh.t3(e8Var, 2));
        this.n = u7Var;
        rl0Var.setAdapter(u7Var);
        u7Var.h = rl0Var;
        f2.i0 i0Var = new f2.i0();
        this.h = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setOnScrollListener(new org.telegram.ui.n6(this, 2));
        rl0Var.setOnItemClickListener(new org.telegram.ui.web.m(3, this, context));
        frameLayout.addView(rl0Var, k7.b6.c(-1.0f, -1));
        t7 t7Var = new t7(this);
        t7Var.n(350L);
        t7Var.o(mr.h);
        t7Var.C = false;
        t7Var.m = false;
        rl0Var.setItemAnimator(t7Var);
        frameLayout.addView(s7Var, k7.b6.e(-1, -2, 55));
        frameLayout.addView(t3Var, k7.b6.e(-1, 32, 55));
        addView(sd0Var, k7.b6.e(-1, -2, 55));
        w7 w7Var = new w7(this, context);
        this.r = w7Var;
        w7Var.setClickable(true);
        w7Var.setOrientation(1);
        int dp = AndroidUtilities.dp(10.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) e8Var).backgroundPaddingLeft;
        int i13 = i10 + dp;
        int dp2 = AndroidUtilities.dp(10.0f);
        int dp3 = AndroidUtilities.dp(10.0f);
        i11 = ((org.telegram.ui.ActionBar.g3) e8Var).backgroundPaddingLeft;
        w7Var.setPadding(i13, dp2, i11 + dp3, AndroidUtilities.dp(10.0f));
        f6Var6 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var6));
        f6Var7 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        d dVar = new d(context, f6Var7, true);
        this.v = dVar;
        dVar.setOnClickListener(new p7(this, 0));
        dVar.e();
        w7Var.addView(dVar, k7.b6.q(-1, 48, 87));
        f6Var8 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        d dVar2 = new d(context, f6Var8, false);
        this.w = dVar2;
        dVar2.setOnClickListener(new p7(this, 1));
        dVar2.e();
        w7Var.addView(dVar2, k7.b6.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        f6Var9 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var9));
        addView(view, k7.b6.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(w7Var, k7.b6.e(-1, -2, 87));
    }

    public final void a(boolean z4) {
        int i10;
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
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
        e8 e8Var = this.T;
        if (i10 == 4) {
            arrayList.addAll(e8Var.d);
            hashMap.putAll(e8Var.e);
        } else if (i10 == 5) {
            arrayList.addAll(e8Var.G);
        } else if (i10 == 1) {
            ArrayList J0 = e8.J0(e8Var);
            for (int i11 = 0; i11 < J0.size(); i11 = android.support.v4.media.a.g(((TLRPC.User) J0.get(i11)).id, arrayList, i11, 1)) {
            }
        } else if (i10 == 2) {
            arrayList.addAll(e8Var.h);
        } else if (i10 == 3) {
            arrayList.addAll(e8Var.n);
            hashMap.putAll(e8Var.r);
        } else if (i10 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        i(false);
        s7 s7Var = this.x;
        s7Var.setText("");
        s7Var.setVisibility(i10 == 0 ? 8 : 0);
        s7Var.H = true;
        this.F = null;
        g(false);
        e(false);
        f(false);
        int i12 = this.a;
        rl0 rl0Var = this.f;
        if (i12 != 0) {
            rl0Var.u0(0);
        }
        rl0Var.requestLayout();
        this.O = -1;
    }

    public final float c() {
        int i10 = 0;
        float f10 = -kf.k0.c(150.0f, Math.min(AndroidUtilities.dp(150.0f), this.x.G), 0);
        while (true) {
            rl0 rl0Var = this.f;
            if (i10 >= rl0Var.getChildCount()) {
                return f10;
            }
            View childAt = rl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i10++;
        }
    }

    public final void d(long j10, TLRPC.ChatParticipants chatParticipants) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int i12 = 0;
        boolean z4 = i11 == 1 || i11 == 2;
        e8 e8Var = this.T;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i13 = 0; i13 < chatParticipants.participants.size(); i13++) {
                long j11 = chatParticipants.participants.get(i13).user_id;
                i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
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
            f6Var2 = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var2);
            alertDialog$Builder.a.Q = "All group members are not in your contact list.";
            alertDialog$Builder.h("Cancel", null);
            alertDialog$Builder.o();
            return;
        }
        Context context2 = getContext();
        f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2, 0, f6Var);
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
        e8 e8Var = this.T;
        d dVar = this.w;
        int i12 = 0;
        d dVar2 = this.v;
        if (i11 == 0) {
            dVar2.setShowZero(false);
            dVar2.setEnabled(true);
            dVar2.c(0, z4);
            if (e8Var.I) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else if (e8Var.W) {
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            } else {
                int i13 = e8Var.F;
                if (i13 == 1) {
                    dVar2.g(LocaleController.getString(e8Var.H ? R.string.StoryLivePrivacyButtonPost : R.string.StoryPrivacyButtonPost), z4, true);
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
        w7 w7Var = this.r;
        if (i11 == 3) {
            int size = e8.l1(arrayList, this.d).size();
            e8Var.s = size;
            dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
            dVar2.setShowZero(false);
            w7Var.b(size <= 0, z4);
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
                int size2 = e8.l1(e8Var.d, e8Var.e).size();
                e8Var.f = size2;
                dVar2.g(LocaleController.getString(R.string.StoryPrivacyButtonSave), z4, true);
                dVar2.setShowZero(false);
                w7Var.b(false, z4);
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
        i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
        nh.t6 storiesController = MessagesController.getInstance(i10).getStoriesController();
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
        e8 e8Var = this.T;
        ArrayList arrayList2 = e8Var.G;
        HashMap hashMap = e8Var.r;
        ArrayList arrayList3 = e8Var.n;
        ArrayList arrayList4 = e8Var.h;
        HashMap hashMap2 = e8Var.e;
        ArrayList arrayList5 = e8Var.d;
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
        if (this.a == 3 && (e8Var.K != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i11 = this.O;
                if (i11 != -1) {
                    e8Var.K = i11;
                }
            } else {
                this.O = e8Var.K;
                e8Var.K = 3;
            }
        }
        HashSet l1 = e8.l1(arrayList6, hashMap3);
        int i12 = 0;
        while (true) {
            arrayList = this.I;
            if (i12 >= arrayList.size()) {
                break;
            }
            o7 o7Var = (o7) arrayList.get(i12);
            if (o7Var != null) {
                int i13 = o7Var.i;
                if (i13 > 0) {
                    o7Var.k = e8Var.K == i13;
                    o7Var.l = false;
                } else {
                    TLRPC.User user = o7Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        o7Var.k = contains;
                        o7Var.l = !contains && l1.contains(Long.valueOf(o7Var.g.id));
                    } else {
                        TLRPC.Chat chat = o7Var.h;
                        if (chat != null) {
                            o7Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            o7Var.l = false;
                        }
                    }
                }
            }
            i12++;
        }
        int i14 = 0;
        while (true) {
            rl0 rl0Var = this.f;
            if (i14 >= rl0Var.getChildCount()) {
                h(z4);
                return;
            }
            View childAt = rl0Var.getChildAt(i14);
            if ((childAt instanceof d8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                o7 o7Var2 = (o7) arrayList.get(R);
                d8 d8Var = (d8) childAt;
                d8Var.c(o7Var2.k || o7Var2.l, z4);
                TLRPC.Chat chat2 = o7Var2.h;
                if (chat2 != null) {
                    d8Var.b(e8.d1(e8Var, chat2) > 200 ? 0.3f : 1.0f, z4);
                } else {
                    if (o7Var2.l && !o7Var2.k) {
                        r8 = 0.5f;
                    }
                    d8Var.b(r8, z4);
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
        u7 u7Var;
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
        o7 o7Var;
        boolean z18;
        String formatPluralString2;
        int i19;
        long clientUserId;
        o7 o7Var2;
        String formatPluralString3;
        int i20;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        e8 e8Var = this.T;
        ArrayList arrayList = e8Var.n;
        ArrayList arrayList2 = e8Var.d;
        ArrayList arrayList3 = e8Var.h;
        HashSet hashSet = e8Var.v;
        ArrayList arrayList4 = this.H;
        arrayList4.clear();
        ArrayList arrayList5 = this.I;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        int i26 = this.a;
        org.telegram.ui.Cells.t3 t3Var = this.y;
        if (i26 != 0) {
            sd0 sd0Var = this.B;
            if (i26 == 1) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsTitle));
                sd0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertCloseFriendsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 2) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsTitle));
                sd0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludedContactsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 3) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsTitle));
                sd0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertSelectContactsSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 5) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageTitle));
                sd0Var.d(e8Var.L);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertAsMessageSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 6) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistTitle));
                sd0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp2 = AndroidUtilities.dp(32.0f) + AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertBlocklistSubtitle));
                h(z4);
                this.C = true;
            } else if (i26 == 4) {
                sd0Var.e(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneTitle));
                sd0Var.d(true);
                ((org.telegram.ui.ActionBar.i2) sd0Var.e).c(0.0f, false);
                arrayList5.add(o7.d());
                arrayList5.add(o7.c());
                arrayList5.size();
                arrayList5.add(o7.e());
                arrayList5.add(o7.f());
                dp = AndroidUtilities.dp(56.0f) + 0.0f + AndroidUtilities.dp(150.0f) + AndroidUtilities.dp(32.0f);
                t3Var.setText(LocaleController.getString(R.string.StoryPrivacyAlertExcludeFromEveryoneSubtitle));
                h(z4);
                this.C = true;
                boolean isEmpty = TextUtils.isEmpty(this.F);
                if (this.a != 0) {
                    String lowerCase = AndroidUtilities.translitSafe(this.F).toLowerCase();
                    int i27 = this.a;
                    ArrayList Y0 = i27 == 5 ? e8.Y0(e8Var) : e8.Z0(e8Var, i27 == 1 || i27 == 2, e8Var.V && (i27 == 3 || i27 == 6));
                    ArrayList arrayList6 = this.c;
                    HashMap hashMap = this.d;
                    HashSet l1 = e8.l1(arrayList6, hashMap);
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
                                o7 i31 = o7.i(user, contains, !contains && l1.contains(Long.valueOf(user.id)));
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
                                    o7 o7Var3 = new o7(3, true);
                                    o7Var3.h = chat;
                                    o7Var3.k = containsKey2;
                                    int i33 = this.a;
                                    o7Var3.m = i33 == 2 || i33 == 4;
                                    arrayList5.add(o7Var3);
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
                                        o7 i37 = o7.i(user3, contains2, !contains2 && l1.contains(Long.valueOf(user3.id)));
                                        int i38 = this.a;
                                        i37.m = i38 == 2 || i38 == 4;
                                        arrayList5.add(i37);
                                        dp += AndroidUtilities.dp(56.0f);
                                        i10++;
                                    } else if (tLObject3 instanceof TLRPC.Chat) {
                                        TLRPC.Chat chat3 = (TLRPC.Chat) tLObject3;
                                        boolean containsKey3 = hashMap.containsKey(Long.valueOf(chat3.id));
                                        o7 o7Var4 = new o7(3, true);
                                        o7Var4.h = chat3;
                                        o7Var4.k = containsKey3;
                                        int i39 = this.a;
                                        if (i39 != 2 && i39 != 4) {
                                            z13 = false;
                                            o7Var4.m = z13;
                                            arrayList5.add(o7Var4);
                                            dp += AndroidUtilities.dp(56.0f);
                                            i10++;
                                            i34 = i11 + 1;
                                        }
                                        z13 = true;
                                        o7Var4.m = z13;
                                        arrayList5.add(o7Var4);
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
                            arrayList5.add(new o7(5, false));
                            dp += AndroidUtilities.dp(150.0f);
                        }
                        rl0 rl0Var = this.f;
                        if (rl0Var != null) {
                            int measuredHeight = (rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop()) - rl0Var.getPaddingBottom();
                            z11 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                            dp3 = measuredHeight + (z11 ? this.Q : 0);
                        } else {
                            dp3 = ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f)) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(42.0f);
                        }
                        float f12 = dp3 - dp;
                        if (f12 > 0.0f) {
                            o7 o7Var5 = new o7(-1, false);
                            o7Var5.p = (int) f12;
                            arrayList5.add(o7Var5);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList5);
                }
                u7Var = this.n;
                if (u7Var != null) {
                    if (!z4 || e8Var.K == 0) {
                        u7Var.l();
                    } else {
                        u7Var.E(arrayList4, arrayList5);
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
            u7Var = this.n;
            if (u7Var != null) {
            }
            this.e.invalidate();
        }
        this.C = false;
        t3Var.setVisibility(8);
        i14 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
        ArrayList arrayList10 = MessagesController.getInstance(i14).getStoriesController().T;
        o7 o7Var6 = new o7(-1, false);
        o7Var6.o = 24;
        arrayList5.add(o7Var6);
        if (e8Var.I) {
            String string = LocaleController.getString(R.string.LiveStorySettingsHeader);
            o7 o7Var7 = new o7(11, false);
            o7Var7.e = string;
            arrayList5.add(o7Var7);
            o7Var6.o = AndroidUtilities.dp(72.0f) + o7Var6.o;
        } else if (e8Var.C && (e8Var.W || arrayList10 == null || arrayList10.size() <= 1)) {
            String string2 = e8Var.W ? LocaleController.getString(R.string.StoryPrivacyAlertEditTitle) : LocaleController.getString(e8Var.H ? R.string.StoryLivePrivacyAlertTitle : R.string.StoryPrivacyAlertTitle);
            if (e8Var.H) {
                formatPluralString = LocaleController.getString(R.string.StoryLivePrivacyAlertSubtitleProfile);
            } else {
                int i40 = e8Var.N;
                formatPluralString = i40 != Integer.MAX_VALUE ? LocaleController.formatPluralString("StoryPrivacyAlertSubtitle", i40 / 3600, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAlertSubtitleProfile);
            }
            o7 o7Var8 = new o7(4, false);
            o7Var8.e = string2;
            o7Var8.f = formatPluralString;
            arrayList5.add(o7Var8);
            o7Var6.o = AndroidUtilities.dp(72.0f) + o7Var6.o;
        } else {
            String string3 = LocaleController.getString(e8Var.H ? R.string.StoryLivePrivacyPublishAs : R.string.StoryPrivacyPublishAs);
            o7 o7Var9 = new o7(8, false);
            o7Var9.e = string3;
            arrayList5.add(o7Var9);
            o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
            TLRPC.InputPeer inputPeer = e8Var.c;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                i15 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                o7 i41 = o7.i(UserConfig.getInstance(i15).getCurrentUser(), false, false);
                i41.n = true;
                arrayList5.add(i41);
                o7Var6.o = AndroidUtilities.dp(62.0f) + o7Var6.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                i18 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                o7 i42 = o7.i(MessagesController.getInstance(i18).getUser(Long.valueOf(e8Var.c.user_id)), false, false);
                i42.n = true;
                arrayList5.add(i42);
                o7Var6.o = AndroidUtilities.dp(62.0f) + o7Var6.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    i17 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    TLRPC.Chat chat4 = MessagesController.getInstance(i17).getChat(Long.valueOf(e8Var.c.channel_id));
                    o7 o7Var10 = new o7(3, true);
                    o7Var10.h = chat4;
                    o7Var10.k = false;
                    o7Var10.n = true;
                    arrayList5.add(o7Var10);
                    z16 = ChatObject.isChannelAndNotMegaGroup(chat4);
                    o7Var6.o = AndroidUtilities.dp(104.0f) + o7Var6.o;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    i16 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i16).getChat(Long.valueOf(e8Var.c.chat_id));
                    o7 o7Var11 = new o7(3, true);
                    o7Var11.h = chat5;
                    o7Var11.k = false;
                    o7Var11.n = true;
                    arrayList5.add(o7Var11);
                    o7Var6.o = AndroidUtilities.dp(104.0f) + o7Var6.o;
                    z16 = false;
                }
                z15 = false;
                o7 g10 = o7.g(null);
                g10.c = !z15 ? 1 : 2;
                arrayList5.add(g10);
                o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
                if (z15) {
                    String string4 = LocaleController.getString(e8Var.H ? R.string.StoryLivePrivacyWhoCanView : R.string.StoryPrivacyWhoCanView);
                    o7 o7Var12 = new o7(8, false);
                    o7Var12.e = string4;
                    arrayList5.add(o7Var12);
                    o7Var6.o = AndroidUtilities.dp(40.0f) + o7Var6.o;
                }
                if (z15 || e8Var.I) {
                    f10 = 80.0f;
                } else {
                    o7 h = o7.h(4, e8Var.f, e8Var.K == 4);
                    arrayList5.add(h);
                    o7Var6.o = AndroidUtilities.dp(56.0f) + o7Var6.o;
                    f10 = 80.0f;
                    if (e8Var.f == 1) {
                        if (arrayList2.size() != 1) {
                            Iterator it = e8Var.e.values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList11 = (ArrayList) it.next();
                                if (arrayList11.size() >= 1) {
                                    i24 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                                    h.g = MessagesController.getInstance(i24).getUser((Long) arrayList11.get(0));
                                    break;
                                }
                            }
                        } else {
                            i25 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            h.g = MessagesController.getInstance(i25).getUser((Long) arrayList2.get(0));
                        }
                    }
                    o7 h9 = o7.h(2, arrayList3.size(), e8Var.K == 2);
                    arrayList5.add(h9);
                    o7Var6.o = AndroidUtilities.dp(56.0f) + o7Var6.o;
                    if (arrayList3.size() == 1) {
                        i23 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        h9.g = MessagesController.getInstance(i23).getUser((Long) arrayList3.get(0));
                    }
                    ArrayList J0 = e8.J0(e8Var);
                    o7 h10 = o7.h(1, J0.size(), e8Var.K == 1);
                    arrayList5.add(h10);
                    o7Var6.o = AndroidUtilities.dp(56.0f) + o7Var6.o;
                    if (J0.size() == 1 && (J0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) J0.get(0);
                    }
                    o7 h11 = o7.h(3, e8Var.s, e8Var.K == 3);
                    arrayList5.add(h11);
                    o7Var6.o = AndroidUtilities.dp(56.0f) + o7Var6.o;
                    if (e8Var.s == 1) {
                        if (arrayList.size() != 1) {
                            Iterator it2 = e8Var.r.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList12 = (ArrayList) it2.next();
                                if (arrayList12.size() >= 1) {
                                    i21 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                                    h11.g = MessagesController.getInstance(i21).getUser((Long) arrayList12.get(0));
                                    break;
                                }
                            }
                        } else {
                            i22 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                            h11.g = MessagesController.getInstance(i22).getUser((Long) arrayList.get(0));
                        }
                    }
                    i20 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                    int i43 = MessagesController.getInstance(i20).getStoriesController().N;
                    String string5 = i43 <= 0 ? LocaleController.getString(e8Var.H ? R.string.StoryLiveBlockListEmpty : R.string.StoryBlockListEmpty) : LocaleController.formatPluralString(e8Var.H ? "StoryLiveBlockList" : "StoryBlockList", i43, new Object[0]);
                    int i44 = org.telegram.ui.ActionBar.j6.gc;
                    q7 q7Var = new q7(this, 3);
                    f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
                    arrayList5.add(o7.g(AndroidUtilities.replaceSingleTag(string5, i44, 0, q7Var, f6Var)));
                    o7Var6.o = AndroidUtilities.dp(80.0f) + o7Var6.o;
                }
                if (!e8Var.W) {
                    if (e8Var.H && !e8Var.I) {
                        if (e8Var.D) {
                            arrayList5.add(o7.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                            o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                            arrayList5.add(o7.b(LocaleController.getString(R.string.LiveStoryRTMPDisable), "", 6));
                            o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                            arrayList5.add(o7.g(null));
                            o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
                        } else {
                            arrayList5.add(o7.b(LocaleController.getString(R.string.LiveStoryRTMPEnable), "", 5));
                            o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                            arrayList5.add(o7.g(LocaleController.getString(R.string.LiveStoryRTMPEnableInfo)));
                            o7Var6.o = AndroidUtilities.dp(30.0f) + o7Var6.o;
                        }
                    }
                    if (e8Var.H) {
                        String string6 = LocaleController.getString(R.string.StoryLiveAllowComments);
                        boolean z19 = e8Var.w;
                        o7 o7Var13 = new o7(7, false);
                        o7Var13.c = 2;
                        o7Var13.e = string6;
                        o7Var13.k = z19;
                        arrayList5.add(o7Var13);
                        o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                    }
                    if (!e8Var.I) {
                        String string7 = LocaleController.getString(R.string.StoryAllowScreenshots);
                        boolean z20 = e8Var.x;
                        o7 o7Var14 = new o7(7, false);
                        o7Var14.c = 0;
                        o7Var14.e = string7;
                        o7Var14.k = z20;
                        arrayList5.add(o7Var14);
                        o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                    }
                    if (!e8Var.H && !e8Var.I) {
                        String string8 = LocaleController.getString(z15 ? R.string.StoryKeep : z16 ? R.string.StoryKeepChannel : R.string.StoryKeepGroup);
                        boolean z21 = e8Var.y;
                        o7 o7Var15 = new o7(7, false);
                        o7Var15.c = 1;
                        o7Var15.e = string8;
                        o7Var15.k = z21;
                        arrayList5.add(o7Var15);
                        o7Var6.o = AndroidUtilities.dp(50.0f) + o7Var6.o;
                    }
                }
                z17 = e8Var.H;
                String str = "StoryKeepGroupInfo";
                if (!z17 || e8Var.I) {
                    arrayList5.add(o7.g(null));
                    o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
                } else if (!e8Var.W && e8Var.B && e8Var.Z != null) {
                    if (z17) {
                        formatPluralString3 = LocaleController.getString(z15 ? R.string.StoryLiveKeepInfo : z16 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    } else {
                        String str2 = z15 ? "StoryKeepInfo" : z16 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i45 = e8Var.N;
                        if (i45 == Integer.MAX_VALUE) {
                            i45 = 86400;
                        }
                        formatPluralString3 = LocaleController.formatPluralString(str2, i45 / 3600, new Object[0]);
                    }
                    arrayList5.add(o7.g(formatPluralString3));
                    o7Var6.o = AndroidUtilities.dp(f10) + o7Var6.o;
                }
                if (e8Var.y || e8Var.H || e8Var.I) {
                    o7Var = o7Var6;
                } else {
                    TLRPC.InputPeer inputPeer2 = e8Var.c;
                    if (inputPeer2 != null) {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    } else {
                        i19 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i19).getClientUserId();
                    }
                    long j10 = clientUserId;
                    e8Var.i1().B(j10, true);
                    StringBuilder sb = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb.append(LocaleController.getString(R.string.StoriesAlbumNameAllStories));
                        o7Var2 = o7Var6;
                    } else {
                        o7Var2 = o7Var6;
                        if (hashSet.size() < 3) {
                            Iterator it3 = hashSet.iterator();
                            while (it3.hasNext()) {
                                Iterator it4 = it3;
                                nh.m6 b10 = e8Var.i1().B(j10, true).b(((Integer) it3.next()).intValue());
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
                    arrayList5.add(o7.b(LocaleController.getString(R.string.StoriesAlbum), sb, 1));
                    o7Var = o7Var2;
                    o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
                }
                if (!e8Var.W && ((!e8Var.B || e8Var.Z == null) && !(z18 = e8Var.H) && !e8Var.I)) {
                    if (z18) {
                        if (z15) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i46 = e8Var.N;
                        if (i46 == Integer.MAX_VALUE) {
                            i46 = 86400;
                        }
                        formatPluralString2 = LocaleController.formatPluralString(str, i46 / 3600, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.getString(z15 ? R.string.StoryLiveKeepInfo : z16 ? R.string.StoryLiveKeepChannelInfo : R.string.StoryLiveKeepGroupInfo);
                    }
                    arrayList5.add(o7.g(formatPluralString2));
                    o7Var.o = AndroidUtilities.dp(f10) + o7Var.o;
                }
                if (e8Var.y && e8Var.B && e8Var.Z != null) {
                    String string9 = LocaleController.getString(R.string.StoryEditCover);
                    BitmapDrawable bitmapDrawable = e8Var.Y;
                    o7 o7Var16 = new o7(9, false);
                    o7Var16.e = string9;
                    o7Var16.d = bitmapDrawable;
                    o7Var16.q = 0;
                    arrayList5.add(o7Var16);
                    o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
                    arrayList5.add(o7.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                    o7Var.o = AndroidUtilities.dp(72.0f) + o7Var.o;
                }
                if (e8Var.I) {
                    arrayList5.add(o7.b(LocaleController.getString(R.string.LiveStoryRTMPSettings), "", 5));
                    o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
                    arrayList5.add(o7.g(null));
                    o7Var.o = AndroidUtilities.dp(52.0f) + o7Var.o;
                }
                if (e8Var.H && e8Var.w) {
                    String string10 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                    o7 o7Var17 = new o7(8, false);
                    o7Var17.e = string10;
                    arrayList5.add(o7Var17);
                    o7Var.o = AndroidUtilities.dp(40.0f) + o7Var.o;
                    o7 o7Var18 = new o7(10, false);
                    o7Var18.q = 8;
                    arrayList5.add(o7Var18);
                    o7Var.o = AndroidUtilities.dp(75.0f) + o7Var.o;
                    arrayList5.add(o7.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                    o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
                }
            }
            z16 = false;
            z15 = true;
            o7 g102 = o7.g(null);
            g102.c = !z15 ? 1 : 2;
            arrayList5.add(g102);
            o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
            if (z15) {
            }
            if (z15) {
            }
            f10 = 80.0f;
            if (!e8Var.W) {
            }
            z17 = e8Var.H;
            String str3 = "StoryKeepGroupInfo";
            if (z17) {
            }
            arrayList5.add(o7.g(null));
            o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
            if (e8Var.y) {
            }
            o7Var = o7Var6;
            if (!e8Var.W) {
                if (z18) {
                }
                arrayList5.add(o7.g(formatPluralString2));
                o7Var.o = AndroidUtilities.dp(f10) + o7Var.o;
            }
            if (e8Var.y) {
                String string92 = LocaleController.getString(R.string.StoryEditCover);
                BitmapDrawable bitmapDrawable2 = e8Var.Y;
                o7 o7Var162 = new o7(9, false);
                o7Var162.e = string92;
                o7Var162.d = bitmapDrawable2;
                o7Var162.q = 0;
                arrayList5.add(o7Var162);
                o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
                arrayList5.add(o7.g(LocaleController.getString(R.string.StoryEditCoverInfo)));
                o7Var.o = AndroidUtilities.dp(72.0f) + o7Var.o;
            }
            if (e8Var.I) {
            }
            if (e8Var.H) {
                String string102 = LocaleController.getString(R.string.LiveStoryPricePerComment);
                o7 o7Var172 = new o7(8, false);
                o7Var172.e = string102;
                arrayList5.add(o7Var172);
                o7Var.o = AndroidUtilities.dp(40.0f) + o7Var.o;
                o7 o7Var182 = new o7(10, false);
                o7Var182.q = 8;
                arrayList5.add(o7Var182);
                o7Var.o = AndroidUtilities.dp(75.0f) + o7Var.o;
                arrayList5.add(o7.g(LocaleController.getString(R.string.LiveStoryPricePerCommentInfo)));
                o7Var.o = AndroidUtilities.dp(50.0f) + o7Var.o;
            }
        }
        z16 = false;
        z15 = true;
        if (z15) {
        }
        f10 = 80.0f;
        if (!e8Var.W) {
        }
        z17 = e8Var.H;
        String str32 = "StoryKeepGroupInfo";
        if (z17) {
        }
        arrayList5.add(o7.g(null));
        o7Var6.o = AndroidUtilities.dp(12.0f) + o7Var6.o;
        if (e8Var.y) {
        }
        o7Var = o7Var6;
        if (!e8Var.W) {
        }
        if (e8Var.y) {
        }
        if (e8Var.I) {
        }
        if (e8Var.H) {
        }
        dp = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.F);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        u7Var = this.n;
        if (u7Var != null) {
        }
        this.e.invalidate();
    }

    public final void h(boolean z4) {
        org.telegram.ui.Cells.t3 t3Var = this.y;
        if (t3Var == null) {
            return;
        }
        if (e8.l1(this.c, this.d).size() > 0) {
            t3Var.b(LocaleController.getString(R.string.UsersDeselectAll), new p7(this, 2));
            return;
        }
        if (z4) {
            t3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.s3 s3Var = t3Var.b;
        s3Var.c(null, false, true);
        s3Var.setOnClickListener(null);
        s3Var.setVisibility(0);
    }

    public final void i(boolean z4) {
        int i10;
        s7 s7Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        org.telegram.ui.ActionBar.f6 f6Var;
        HashSet l1 = e8.l1(this.c, this.d);
        int i11 = this.a;
        e8 e8Var = this.T;
        if (i11 == 3) {
            e8Var.s = l1.size();
        } else if (i11 == 4) {
            e8Var.f = l1.size();
        }
        i10 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            s7Var = this.x;
            ArrayList arrayList4 = s7Var.d;
            arrayList = s7Var.d;
            if (i13 >= arrayList4.size()) {
                break;
            }
            o30 o30Var = (o30) arrayList.get(i13);
            if (!l1.contains(Long.valueOf(o30Var.getUid()))) {
                arrayList2.add(o30Var);
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
                        f6Var = ((org.telegram.ui.ActionBar.g3) e8Var).resourcesProvider;
                        o30 o30Var2 = new o30(context, user, null, true, f6Var);
                        o30Var2.setOnClickListener(this);
                        arrayList3.add(o30Var2);
                    }
                } else if (((o30) arrayList.get(i14)).getUid() == longValue) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        kg.j jVar = s7Var.c;
        ArrayList arrayList5 = jVar.e;
        ArrayList arrayList6 = jVar.d;
        ArrayList arrayList7 = jVar.f;
        b8 b8Var = (b8) jVar.n;
        b8Var.D = true;
        ArrayList arrayList8 = b8Var.d;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = jVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((o30) arrayList2.get(i15)).setOnClickListener(null);
        }
        jVar.c();
        if (z4) {
            jVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.b = animatorSet;
            animatorSet.addListener(new a8(jVar, arrayList2, i12));
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
                o30 o30Var3 = (o30) arrayList2.get(i16);
                arrayList5.add(o30Var3);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, (Property<o30, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, (Property<o30, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var3, (Property<o30, Float>) property, 1.0f, 0.0f));
                i16++;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                o30 o30Var4 = (o30) arrayList3.get(i17);
                arrayList6.add(o30Var4);
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, (Property<o30, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, (Property<o30, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(o30Var4, (Property<o30, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                jVar.removeView((View) arrayList2.get(i18));
            }
            arrayList9.clear();
            jVar.b = null;
            jVar.c = false;
            b8Var.a.setAllowDrawCursor(true);
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
        s7 s7Var = this.x;
        if (z4 || this.R || getTranslationX() != 0.0f) {
            this.K = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            s7Var.setTranslationY(c3);
        } else if (!this.K || Math.abs(this.L - c3) > 1.0f) {
            this.K = true;
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.M = null;
            }
            float translationY = s7Var.getTranslationY();
            this.L = c3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c3);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new nh.e5(this, 22));
            this.M.addListener(new j2(this, 5));
            this.M.setInterpolator(new LinearInterpolator());
            this.M.setDuration(180L);
            this.M.start();
        }
        boolean z11 = this.C;
        sd0 sd0Var = this.B;
        if (!z11) {
            sd0Var.setVisibility(8);
            return;
        }
        sd0Var.setVisibility(0);
        float f10 = -sd0Var.getHeight();
        int i10 = 0;
        while (true) {
            rl0 rl0Var = this.f;
            if (i10 >= rl0Var.getChildCount()) {
                z10 = true;
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i10++;
        }
        if (this.N != z10) {
            this.N = z10;
            ((org.telegram.ui.ActionBar.i2) sd0Var.e).c((z10 || this.a != 0) ? 0.0f : 1.0f, true);
        }
        sd0Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s7 s7Var = this.x;
        if (!s7Var.d.contains(view)) {
            return;
        }
        o30 o30Var = (o30) view;
        if (!o30Var.y) {
            o30 o30Var2 = s7Var.e;
            if (o30Var2 != null) {
                o30Var2.a();
                s7Var.e = null;
            }
            s7Var.e = o30Var;
            o30Var.b();
            return;
        }
        s7Var.e = null;
        kg.j jVar = s7Var.c;
        b8 b8Var = (b8) jVar.n;
        b8Var.D = true;
        b8Var.d.remove(o30Var);
        o30Var.setOnClickListener(null);
        jVar.c();
        jVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        jVar.b = animatorSet;
        animatorSet.addListener(new ex0(18, jVar, o30Var));
        ArrayList arrayList = jVar.h;
        arrayList.clear();
        arrayList.add(o30Var);
        ArrayList arrayList2 = jVar.d;
        arrayList2.clear();
        jVar.e.clear();
        arrayList2.add(o30Var);
        ArrayList arrayList3 = jVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(o30Var, (Property<o30, Float>) View.ALPHA, 1.0f, 0.0f));
        jVar.requestLayout();
        long uid = o30Var.getUid();
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
        i10 = ((org.telegram.ui.ActionBar.g3) this.T).currentAccount;
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
        e8 e8Var = this.T;
        i12 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardHeight;
        if (i12 > 0) {
            i13 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardHeight;
            this.Q = i13;
        }
        super.onMeasure(i10, i11);
        this.e.setPadding(0, AndroidUtilities.statusBarHeight + (this.a == 0 ? 0 : AndroidUtilities.dp(56.0f)), 0, 0);
        boolean z16 = this.S;
        z4 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
        rl0 rl0Var = this.f;
        w7 w7Var = this.r;
        if (z16 != z4) {
            float c3 = c();
            z10 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
            int i14 = 2;
            if (z10 && c3 + Math.min(AndroidUtilities.dp(150.0f), this.x.G) > rl0Var.getPaddingTop()) {
                wh.o oVar = new wh.o(getContext(), 2, 0.7f);
                oVar.a = 1;
                oVar.p = -AndroidUtilities.dp(56.0f);
                this.h.w0(oVar);
            }
            int i15 = this.a;
            View view = this.s;
            if (i15 == 0) {
                z14 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                w7Var.setTranslationY(z14 ? this.Q : 0.0f);
                z15 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                view.setTranslationY(z15 ? this.Q : 0.0f);
            } else {
                z11 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                float f10 = z11 ? this.Q : -this.Q;
                ValueAnimator valueAnimator = w7Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    w7Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                w7Var.d = ofFloat;
                ofFloat.addUpdateListener(new v7(w7Var, 1));
                w7Var.d.addListener(new j2(w7Var, 6));
                w7Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = w7Var.d;
                mr mrVar = org.telegram.ui.ActionBar.r1.w;
                valueAnimator2.setInterpolator(mrVar);
                w7Var.d.start();
                z12 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                view.setTranslationY(z12 ? this.Q : -this.Q);
                this.R = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(mrVar).withEndAction(new q7(this, i14)).start();
            }
            z13 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
            this.S = z13;
        }
        rl0Var.setPadding(0, 0, 0, w7Var.getMeasuredHeight());
    }
}
