package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bi.k6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import m.g3;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.nx;
import org.telegram.ui.vo0;
import org.telegram.ui.wy;
import org.telegram.ui.zp0;
import qg.q0;
import r0.l1;
import r0.n;
import s4.m0;
import uh.l;
import wh.k0;
import wh.p1;
import xf.m;
import xh.e0;
import xh.l3;
import xh.v5;
import xh.w7;
import xh.z3;
import xh.z7;
import za.b0;
import za.c0;
import zh.i7;
import zh.j0;
import zh.j7;
import zh.k;
import zh.l0;
import zh.m6;
import zh.n6;
import zh.o;
import zh.o1;
import zh.o7;
import zh.r5;
import zh.t0;
import zh.u7;
import zh.y3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements a, Continuation, m, c2, n, BillingController.ProductDetailsResponseListenerLegacy, x2.m, c5, le.d, Utilities.Callback5, vo0, i5.e, ll0, Utilities.Callback2Return, kl0, r5, o7, l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // le.d
    public void G(int i10, float f7, float f10, le.e eVar) {
        View view = ((z3) this.b).b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        switch (this.a) {
            case 5:
                ((k0) this.b).h.i(l1Var);
                break;
            default:
                u7 u7Var = (u7) this.b;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u7Var.v.getLayoutParams();
                marginLayoutParams.topMargin = u7Var.c ? 0 : l1Var.d();
                marginLayoutParams.bottomMargin = u7Var.c ? l1Var.a.f(2).d : l1Var.a();
                marginLayoutParams.leftMargin = defaultWindowInsets.a;
                marginLayoutParams.rightMargin = defaultWindowInsets.c;
                i7 i7Var = u7Var.s;
                if (i7Var != null) {
                    i7Var.requestLayout();
                }
                j7 j7Var = u7Var.v;
                if (j7Var != null) {
                    j7Var.requestLayout();
                }
                break;
        }
        return l1.b;
    }

    @Override // org.telegram.ui.vo0
    public void a(int i10) {
        switch (this.a) {
            case 14:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        callback2.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    callback2.run(Boolean.TRUE, null);
                    break;
                }
                break;
            case 15:
                k6 k6Var = (k6) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        k6Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    k6Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                n80 n80Var = (n80) this.b;
                if (i10 != 1) {
                    if (i10 != 3) {
                        n80Var.run(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    n80Var.run(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((g3) this.b).getClass();
        String a2 = c0.b.a((b0) obj);
        kotlin.jvm.internal.i.d(a2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(a2));
        byte[] bytes = a2.getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // zh.r5
    public void b(boolean z10) {
        y3 y3Var = (y3) this.b;
        if (y3Var != null) {
            y3Var.c();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        int i11;
        int i12;
        int i13;
        o1 o1Var = (o1) this.b;
        zp0 zp0Var = o1Var.c;
        ArrayList arrayList = o1Var.r;
        l0 l0Var = ((j0) view).f;
        int i14 = o1Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= l0Var.f.size()) {
                break;
            }
            zh.k0 k0Var = (zh.k0) l0Var.f.get(i16);
            long j10 = k0Var.g;
            if (j10 > 0 && currentTime - k0Var.d <= o.b(i14, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(k0Var.a));
            }
            i16++;
        }
        t0 t0Var = o1Var.P;
        long j11 = t0Var != null ? t0Var.j() : 0L;
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            zh.k0 k0Var2 = (zh.k0) arrayList.get(i17);
            if (k0Var2.b || !k0Var2.e || k0Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(k0Var2.a))) {
                    j3 = j11;
                    if (o1Var.w != l0Var.b || (i13 = o1Var.x) == 0 || k0Var2.a < i13) {
                        i11 = k0Var2.a;
                        break;
                    }
                } else {
                    j3 = j11;
                }
                i18++;
            } else {
                j3 = j11;
            }
            i17++;
            j11 = j3;
        }
        j3 = j11;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
                zh.k0 k0Var3 = (zh.k0) arrayList.get(i15);
                if (k0Var3.b || !k0Var3.e || k0Var3.g >= j3) {
                    if (hashSet.contains(Integer.valueOf(k0Var3.a))) {
                        i12 = k0Var3.a;
                        i18 = i19;
                        break;
                    }
                    i19++;
                }
                i15++;
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        o1Var.w = l0Var.b;
        o1Var.x = i12;
        o1Var.y = true;
        m0 itemAnimator = zp0Var.getItemAnimator();
        zp0Var.setItemAnimator(null);
        o1Var.d.i1(i18, zp0Var.getHeight() / 2, true);
        o1Var.e.m(i18);
        zp0Var.setItemAnimator(itemAnimator);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0216  */
    @Override // org.telegram.ui.Components.ll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(int i10, final View view) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j3;
        boolean z10;
        vq vqVar;
        boolean z11;
        boolean z12;
        w70 w70Var;
        int i18;
        final nx nxVar = (nx) this.b;
        if (nxVar.N == 0.0f && nxVar.n0 == 0.0f) {
            final long j10 = ((k) view).E;
            wy wyVar = nxVar.O0;
            i11 = ((p2) wyVar).currentAccount;
            MediaDataController.getInstance(i11).loadHints(true);
            w70 H = w70.H(wyVar, view);
            H.z.set(0, AndroidUtilities.dp(8.0f), 0, 0);
            H.W(j6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wyVar.getThemedColor(j6.d6)));
            H.a0(0.0f, AndroidUtilities.dp(8.0f));
            wyVar.L0 = H;
            if (!UserObject.isService(j10)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i12 = ((p2) wyVar).currentAccount;
                if (j10 != UserConfig.getInstance(i12).getClientUserId()) {
                    final TLRPC.User user = wyVar.getMessagesController().getUser(Long.valueOf(j10));
                    TLRPC.Chat chat = wyVar.getMessagesController().getChat(Long.valueOf(-j10));
                    final String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, 0L);
                    i13 = ((p2) wyVar).currentAccount;
                    boolean c02 = NotificationsCustomSettingsActivity.c0(i13, j10);
                    i14 = ((p2) wyVar).currentAccount;
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i14).premiumFeaturesBlocked();
                    i15 = ((p2) wyVar).currentAccount;
                    boolean isPremium = UserConfig.getInstance(i15).isPremium();
                    i16 = ((p2) wyVar).currentAccount;
                    boolean J = MessagesController.getInstance(i16).getStoriesController().J(j10);
                    i17 = ((p2) wyVar).currentAccount;
                    boolean F = MessagesController.getInstance(i17).getStoriesController().F(j10);
                    if (premiumFeaturesBlocked || j10 <= 0 || isPremium) {
                        j3 = 0;
                        z10 = false;
                    } else {
                        z10 = false;
                        Drawable drawable = nxVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                        if (drawable != null) {
                            Drawable drawable2 = nxVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                            if (drawable2 != null) {
                                j3 = 0;
                                drawable2.setColorFilter(new PorterDuffColorFilter(wyVar.getThemedColor(j6.F8), PorterDuff.Mode.MULTIPLY));
                            } else {
                                j3 = 0;
                            }
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                            vqVar = new vq(drawable2, drawable);
                            vq vqVar2 = vqVar;
                            if (j10 < j3 && wyVar.X3().j(j10)) {
                                final int i19 = 4;
                                wyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.jx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i20;
                                        switch (i19) {
                                            case 0:
                                                nxVar.O0.presentFragment(eo.R9(j10));
                                                break;
                                            case 1:
                                                AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                break;
                                            case 2:
                                                AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                break;
                                            case 3:
                                                wy wyVar2 = nxVar.O0;
                                                i20 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                MediaDataController mediaDataController = MediaDataController.getInstance(i20);
                                                long j11 = j10;
                                                mediaDataController.removePeer(j11);
                                                wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                break;
                                            case 4:
                                                nxVar.O0.E0.j(j10);
                                                break;
                                            case 5:
                                                nxVar.O0.presentFragment(eo.R9(j10));
                                                break;
                                            default:
                                                nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (user != null && !user.contact) {
                                i18 = ((p2) wyVar).currentAccount;
                                if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                                    z11 = true;
                                    w70 w70Var2 = wyVar.L0;
                                    final int i20 = 5;
                                    w70Var2.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i20) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i21 = 6;
                                    w70Var2.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i21) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i22 = 0;
                                    w70Var2.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i22) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i23 = 0;
                                    w70Var2.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.kx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i24;
                                            String trim;
                                            int i25;
                                            int i26 = i23;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            nx nxVar2 = nxVar;
                                            switch (i26) {
                                                case 0:
                                                    wy wyVar2 = nxVar2.O0;
                                                    i24 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i24).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    wy wyVar3 = nxVar2.O0;
                                                    i25 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !c02 && j10 > j3);
                                    w70Var2.E();
                                    final int i24 = 1;
                                    w70Var2.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.kx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i242;
                                            String trim;
                                            int i25;
                                            int i26 = i24;
                                            TLRPC.User user2 = user;
                                            long j11 = j10;
                                            String str = sharedPrefKey;
                                            nx nxVar2 = nxVar;
                                            switch (i26) {
                                                case 0:
                                                    wy wyVar2 = nxVar2.O0;
                                                    i242 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                                    wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                                    break;
                                                default:
                                                    wy wyVar3 = nxVar2.O0;
                                                    i25 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                                    MessagesController.getNotificationsSettings(i25).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                                    wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                                    trim = user2 != null ? user2.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, c02 && j10 > j3);
                                    w70Var2.E();
                                    final int i25 = 0;
                                    w70Var2.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i26;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i25) {
                                                case 0:
                                                    nx nxVar2 = nxVar;
                                                    wy wyVar2 = nxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i26 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i26).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof zh.k) {
                                                                wyVar2.E0.i((zh.k) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = nxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                                    zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                                    i4Var.e = new mx(nxVar2, view2, 1);
                                                    wyVar2.showDialog(i4Var);
                                                    break;
                                                default:
                                                    nx nxVar3 = nxVar;
                                                    Context context2 = nxVar3.getContext();
                                                    wy wyVar3 = nxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                                    zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                                    i4Var2.e = new mx(nxVar3, view, 0);
                                                    wyVar3.showDialog(i4Var2);
                                                    break;
                                            }
                                        }
                                    }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                                    w70Var2.E();
                                    z12 = premiumFeaturesBlocked && j10 > j3 && !isPremium && J && !F;
                                    int i26 = R.drawable.msg_stories_stealth2;
                                    String string = LocaleController.getString(R.string.ViewAnonymously);
                                    final int i27 = 1;
                                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.lx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.f6 f6Var;
                                            int i262;
                                            org.telegram.ui.ActionBar.f6 f6Var2;
                                            switch (i27) {
                                                case 0:
                                                    nx nxVar2 = nxVar;
                                                    wy wyVar2 = nxVar2.O0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i262 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof zh.k) {
                                                                wyVar2.E0.i((zh.k) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = nxVar2.getContext();
                                                    f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                                    zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                                    i4Var.e = new mx(nxVar2, view2, 1);
                                                    wyVar2.showDialog(i4Var);
                                                    break;
                                                default:
                                                    nx nxVar3 = nxVar;
                                                    Context context2 = nxVar3.getContext();
                                                    wy wyVar3 = nxVar3.O0;
                                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                                    zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                                    i4Var2.e = new mx(nxVar3, view, 0);
                                                    wyVar3.showDialog(i4Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z12) {
                                        w70Var2.b(i26, vqVar2, string, j6.F8, j6.E8, runnable);
                                        w70Var = w70Var2;
                                    } else {
                                        w70Var = w70Var2;
                                    }
                                    w70Var.E();
                                    final int i28 = 1;
                                    w70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i28) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && !wyVar.e4());
                                    w70Var.E();
                                    final int i29 = 2;
                                    w70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i29) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11 && wyVar.e4());
                                    w70Var.E();
                                    final int i30 = 3;
                                    w70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.jx
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i202;
                                            switch (i30) {
                                                case 0:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    wy wyVar2 = nxVar.O0;
                                                    i202 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                    MediaDataController mediaDataController = MediaDataController.getInstance(i202);
                                                    long j11 = j10;
                                                    mediaDataController.removePeer(j11);
                                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                                    break;
                                                case 4:
                                                    nxVar.O0.E0.j(j10);
                                                    break;
                                                case 5:
                                                    nxVar.O0.presentFragment(eo.R9(j10));
                                                    break;
                                                default:
                                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                                    break;
                                            }
                                        }
                                    }, z11);
                                }
                            }
                            z11 = false;
                            w70 w70Var22 = wyVar.L0;
                            final int i202 = 5;
                            w70Var22.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i202) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i212 = 6;
                            w70Var22.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i212) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            if (j10 < j3) {
                            }
                            final int i222 = 0;
                            w70Var22.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i222) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i232 = 0;
                            w70Var22.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.kx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i242;
                                    String trim;
                                    int i252;
                                    int i262 = i232;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    nx nxVar2 = nxVar;
                                    switch (i262) {
                                        case 0:
                                            wy wyVar2 = nxVar2.O0;
                                            i242 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i242).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            wy wyVar3 = nxVar2.O0;
                                            i252 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !c02 && j10 > j3);
                            w70Var22.E();
                            final int i242 = 1;
                            w70Var22.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.kx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2422;
                                    String trim;
                                    int i252;
                                    int i262 = i242;
                                    TLRPC.User user2 = user;
                                    long j11 = j10;
                                    String str = sharedPrefKey;
                                    nx nxVar2 = nxVar;
                                    switch (i262) {
                                        case 0:
                                            wy wyVar2 = nxVar2.O0;
                                            i2422 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                            wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                            break;
                                        default:
                                            wy wyVar3 = nxVar2.O0;
                                            i252 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                            MessagesController.getNotificationsSettings(i252).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                            wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                            trim = user2 != null ? user2.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, c02 && j10 > j3);
                            w70Var22.E();
                            final int i252 = 0;
                            w70Var22.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i262;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i252) {
                                        case 0:
                                            nx nxVar2 = nxVar;
                                            wy wyVar2 = nxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i262 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i262).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof zh.k) {
                                                        wyVar2.E0.i((zh.k) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = nxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                            zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                            i4Var.e = new mx(nxVar2, view2, 1);
                                            wyVar2.showDialog(i4Var);
                                            break;
                                        default:
                                            nx nxVar3 = nxVar;
                                            Context context2 = nxVar3.getContext();
                                            wy wyVar3 = nxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                            zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                            i4Var2.e = new mx(nxVar3, view, 0);
                                            wyVar3.showDialog(i4Var2);
                                            break;
                                    }
                                }
                            }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                            w70Var22.E();
                            if (premiumFeaturesBlocked) {
                            }
                            int i262 = R.drawable.msg_stories_stealth2;
                            String string2 = LocaleController.getString(R.string.ViewAnonymously);
                            final int i272 = 1;
                            Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.lx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i2622;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i272) {
                                        case 0:
                                            nx nxVar2 = nxVar;
                                            wy wyVar2 = nxVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i2622 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof zh.k) {
                                                        wyVar2.E0.i((zh.k) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = nxVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                            zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                            i4Var.e = new mx(nxVar2, view2, 1);
                                            wyVar2.showDialog(i4Var);
                                            break;
                                        default:
                                            nx nxVar3 = nxVar;
                                            Context context2 = nxVar3.getContext();
                                            wy wyVar3 = nxVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                            zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                            i4Var2.e = new mx(nxVar3, view, 0);
                                            wyVar3.showDialog(i4Var2);
                                            break;
                                    }
                                }
                            };
                            if (z12) {
                            }
                            w70Var.E();
                            final int i282 = 1;
                            w70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i282) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && !wyVar.e4());
                            w70Var.E();
                            final int i292 = 2;
                            w70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i292) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11 && wyVar.e4());
                            w70Var.E();
                            final int i302 = 3;
                            w70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.jx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2022;
                                    switch (i302) {
                                        case 0:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        case 1:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 2:
                                            AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                            break;
                                        case 3:
                                            wy wyVar2 = nxVar.O0;
                                            i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                            MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                            long j11 = j10;
                                            mediaDataController.removePeer(j11);
                                            wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                            break;
                                        case 4:
                                            nxVar.O0.E0.j(j10);
                                            break;
                                        case 5:
                                            nxVar.O0.presentFragment(eo.R9(j10));
                                            break;
                                        default:
                                            nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                            break;
                                    }
                                }
                            }, z11);
                        } else {
                            j3 = 0;
                        }
                    }
                    vqVar = null;
                    vq vqVar22 = vqVar;
                    if (j10 < j3) {
                        final int i192 = 4;
                        wyVar.L0.b(R.drawable.msg_stories_add, null, LocaleController.getString(R.string.AddStory), j6.F8, j6.E8, new Runnable() { // from class: org.telegram.ui.jx
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2022;
                                switch (i192) {
                                    case 0:
                                        nxVar.O0.presentFragment(eo.R9(j10));
                                        break;
                                    case 1:
                                        AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                        break;
                                    case 2:
                                        AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                        break;
                                    case 3:
                                        wy wyVar2 = nxVar.O0;
                                        i2022 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                        MediaDataController mediaDataController = MediaDataController.getInstance(i2022);
                                        long j11 = j10;
                                        mediaDataController.removePeer(j11);
                                        wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                        break;
                                    case 4:
                                        nxVar.O0.E0.j(j10);
                                        break;
                                    case 5:
                                        nxVar.O0.presentFragment(eo.R9(j10));
                                        break;
                                    default:
                                        nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                        break;
                                }
                            }
                        });
                    }
                    if (user != null) {
                        i18 = ((p2) wyVar).currentAccount;
                        if (MediaDataController.getInstance(i18).containsTopPeer(j10)) {
                        }
                    }
                    z11 = false;
                    w70 w70Var222 = wyVar.L0;
                    final int i2022 = 5;
                    w70Var222.l(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2022) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, j10 > j3);
                    final int i2122 = 6;
                    w70Var222.l(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2122) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, j10 > j3);
                    if (j10 < j3) {
                    }
                    final int i2222 = 0;
                    w70Var222.l(R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2222) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, j10 < j3);
                    final int i2322 = 0;
                    w70Var222.l(R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() { // from class: org.telegram.ui.kx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2422;
                            String trim;
                            int i2522;
                            int i2622 = i2322;
                            TLRPC.User user2 = user;
                            long j11 = j10;
                            String str = sharedPrefKey;
                            nx nxVar2 = nxVar;
                            switch (i2622) {
                                case 0:
                                    wy wyVar2 = nxVar2.O0;
                                    i2422 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MessagesController.getNotificationsSettings(i2422).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                    wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                    break;
                                default:
                                    wy wyVar3 = nxVar2.O0;
                                    i2522 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                    MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                    wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !c02 && j10 > j3);
                    w70Var222.E();
                    final int i2422 = 1;
                    w70Var222.l(R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() { // from class: org.telegram.ui.kx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i24222;
                            String trim;
                            int i2522;
                            int i2622 = i2422;
                            TLRPC.User user2 = user;
                            long j11 = j10;
                            String str = sharedPrefKey;
                            nx nxVar2 = nxVar;
                            switch (i2622) {
                                case 0:
                                    wy wyVar2 = nxVar2.O0;
                                    i24222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MessagesController.getNotificationsSettings(i24222).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, false).apply();
                                    wyVar2.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.wc.a0(wyVar2).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim)), null, null).j();
                                    break;
                                default:
                                    wy wyVar3 = nxVar2.O0;
                                    i2522 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                    MessagesController.getNotificationsSettings(i2522).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + str, true).apply();
                                    wyVar3.getNotificationsController().updateServerNotificationsSettings(j11, 0L);
                                    trim = user2 != null ? user2.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.wc.a0(wyVar3).V(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, c02 && j10 > j3);
                    w70Var222.E();
                    final int i2522 = 0;
                    w70Var222.l(R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.ViewAnonymously), new Runnable() { // from class: org.telegram.ui.lx
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.f6 f6Var;
                            int i2622;
                            org.telegram.ui.ActionBar.f6 f6Var2;
                            switch (i2522) {
                                case 0:
                                    nx nxVar2 = nxVar;
                                    wy wyVar2 = nxVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i2622 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i2622).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof zh.k) {
                                                wyVar2.E0.i((zh.k) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = nxVar2.getContext();
                                    f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                    zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                    i4Var.e = new mx(nxVar2, view2, 1);
                                    wyVar2.showDialog(i4Var);
                                    break;
                                default:
                                    nx nxVar3 = nxVar;
                                    Context context2 = nxVar3.getContext();
                                    wy wyVar3 = nxVar3.O0;
                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                    zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                    i4Var2.e = new mx(nxVar3, view, 0);
                                    wyVar3.showDialog(i4Var2);
                                    break;
                            }
                        }
                    }, premiumFeaturesBlocked && j10 > j3 && isPremium && J && !F);
                    w70Var222.E();
                    if (premiumFeaturesBlocked) {
                    }
                    int i2622 = R.drawable.msg_stories_stealth2;
                    String string22 = LocaleController.getString(R.string.ViewAnonymously);
                    final int i2722 = 1;
                    Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.lx
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.f6 f6Var;
                            int i26222;
                            org.telegram.ui.ActionBar.f6 f6Var2;
                            switch (i2722) {
                                case 0:
                                    nx nxVar2 = nxVar;
                                    wy wyVar2 = nxVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i26222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i26222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof zh.k) {
                                                wyVar2.E0.i((zh.k) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = nxVar2.getContext();
                                    f6Var = ((org.telegram.ui.ActionBar.p2) wyVar2).resourceProvider;
                                    zh.i4 i4Var = new zh.i4(context, 0.0f, 1, f6Var);
                                    i4Var.e = new mx(nxVar2, view2, 1);
                                    wyVar2.showDialog(i4Var);
                                    break;
                                default:
                                    nx nxVar3 = nxVar;
                                    Context context2 = nxVar3.getContext();
                                    wy wyVar3 = nxVar3.O0;
                                    f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar3).resourceProvider;
                                    zh.i4 i4Var2 = new zh.i4(context2, 0.0f, 1, f6Var2);
                                    i4Var2.e = new mx(nxVar3, view, 0);
                                    wyVar3.showDialog(i4Var2);
                                    break;
                            }
                        }
                    };
                    if (z12) {
                    }
                    w70Var.E();
                    final int i2822 = 1;
                    w70Var.l(R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2822) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, z11 && !wyVar.e4());
                    w70Var.E();
                    final int i2922 = 2;
                    w70Var.l(R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i2922) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, z11 && wyVar.e4());
                    w70Var.E();
                    final int i3022 = 3;
                    w70Var.l(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() { // from class: org.telegram.ui.jx
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20222;
                            switch (i3022) {
                                case 0:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                case 1:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 2:
                                    AndroidUtilities.runOnUIThread(new jw(nxVar.O0, j10, !r2.e4(), 0), 200L);
                                    break;
                                case 3:
                                    wy wyVar2 = nxVar.O0;
                                    i20222 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    MediaDataController mediaDataController = MediaDataController.getInstance(i20222);
                                    long j11 = j10;
                                    mediaDataController.removePeer(j11);
                                    wyVar2.getMessagesController().getStoriesController().i0(j11, true, false);
                                    break;
                                case 4:
                                    nxVar.O0.E0.j(j10);
                                    break;
                                case 5:
                                    nxVar.O0.presentFragment(eo.R9(j10));
                                    break;
                                default:
                                    nxVar.O0.presentFragment(ProfileActivity.m4(j10));
                                    break;
                            }
                        }
                    }, z11);
                } else if (wyVar.O3) {
                    w70 w70Var3 = wyVar.L0;
                    int i31 = R.drawable.msg_stories_add;
                    String string3 = LocaleController.getString(R.string.AddStory);
                    int i32 = j6.F8;
                    int i33 = j6.E8;
                    final int i34 = 0;
                    w70Var3.b(i31, null, string3, i32, i33, new Runnable() { // from class: org.telegram.ui.ix
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i35;
                            int i36;
                            switch (i34) {
                                case 0:
                                    nxVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    wy wyVar2 = nxVar.O0;
                                    i35 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i35).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wyVar2.presentFragment(new org.telegram.ui.Components.la0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    wy wyVar3 = nxVar.O0;
                                    i36 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wyVar3.presentFragment(new org.telegram.ui.Components.la0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    final int i35 = 1;
                    wyVar.L0.b(R.drawable.msg_stories_archive, null, LocaleController.getString(R.string.ArchivedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.ix
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i352;
                            int i36;
                            switch (i35) {
                                case 0:
                                    nxVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    wy wyVar2 = nxVar.O0;
                                    i352 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wyVar2.presentFragment(new org.telegram.ui.Components.la0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    wy wyVar3 = nxVar.O0;
                                    i36 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i36).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wyVar3.presentFragment(new org.telegram.ui.Components.la0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    final int i36 = 2;
                    wyVar.L0.b(R.drawable.msg_stories_saved, null, LocaleController.getString(R.string.SavedStories), i32, i33, new Runnable() { // from class: org.telegram.ui.ix
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i352;
                            int i362;
                            switch (i36) {
                                case 0:
                                    nxVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    wy wyVar2 = nxVar.O0;
                                    i352 = ((org.telegram.ui.ActionBar.p2) wyVar2).currentAccount;
                                    bundle.putLong("dialog_id", UserConfig.getInstance(i352).getClientUserId());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wyVar2.presentFragment(new org.telegram.ui.Components.la0(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    wy wyVar3 = nxVar.O0;
                                    i362 = ((org.telegram.ui.ActionBar.p2) wyVar3).currentAccount;
                                    bundle2.putLong("dialog_id", UserConfig.getInstance(i362).getClientUserId());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wyVar3.presentFragment(new org.telegram.ui.Components.la0(bundle2, null));
                                    break;
                            }
                        }
                    });
                    z10 = false;
                } else {
                    nx nxVar2 = wyVar.E0;
                    if (nxVar2 != null) {
                        nxVar2.n();
                    }
                }
                w70 w70Var4 = wyVar.L0;
                w70Var4.i = 3;
                w70Var4.a0(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f));
                w70Var4.Z();
                return z10;
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // x2.m
    public a1 e(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 4:
                ((org.telegram.messenger.k0) this.b).run();
                break;
            case 10:
                ((Utilities.Callback) this.b).run(d2Var.g(i10, true, true));
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }

    @Override // zh.o7
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // xf.m
    public void h(long j3) {
        switch (this.a) {
            case 3:
                ((wh.d) this.b).a(j3, true);
                break;
            default:
                ((l3) this.b).h();
                break;
        }
    }

    @Override // uh.l
    public void l(uh.h hVar, float f7, float f10) {
        n6 n6Var = (n6) this.b;
        if (n6Var.v.x) {
            return;
        }
        hVar.q = new m6(n6Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = n6Var.i;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uh.h) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        p1 p1Var = (p1) this.b;
        ArrayList arrayList = p1Var.n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    qg.k kVar = (qg.k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.c)) {
                        kVar.h = oVar;
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((qg.k) obj2).g = j3;
        }
        AndroidUtilities.runOnUIThread(new q0(p1Var, 21));
    }

    @Override // th.a
    public void p(Canvas canvas, int i10) {
        i iVar = (i) this.b;
        iVar.getClass();
        canvas.save();
        RectF rectF = iVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        iVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return zh.m0.a((zh.m0) this.b, (Long) obj2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 13:
                v5.b((v5) this.b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                break;
            default:
                w7 w7Var = (w7) this.b;
                v51 v51Var = (v51) obj;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                w7Var.getClass();
                if (v51Var.G instanceof TL_stars.StarsTransaction) {
                    z7.h1(w7Var.getContext(), false, 0L, w7Var.c, (TL_stars.StarsTransaction) v51Var.G, w7Var.b);
                    break;
                }
                break;
        }
    }

    @Override // le.d
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.kl0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
