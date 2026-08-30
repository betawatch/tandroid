package uf;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k7.b6;
import m.u2;
import nh.t2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pt;
import org.telegram.ui.yh;
import ph.d4;
import ph.i3;
import ph.l5;
import ph.y1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k extends b61 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument B;
    public boolean C;
    public String D;
    public String E;
    public long F;
    public boolean G;
    public t2 I;
    public mr e;
    public org.telegram.ui.ActionBar.w0 f;
    public ph h;
    public i n;
    public w5 r;
    public j s;
    public j v;
    public String y;
    public final g d = new g(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean H = g0();

    public static void Y(k kVar) {
        k kVar2;
        pt.q().T = null;
        if (kVar.getParentActivity() == null) {
            return;
        }
        if (kVar.getParentActivity() == null || kVar.getParentActivity() == null || kVar.I != null) {
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            t2 t2Var = new t2(kVar2, kVar.getParentActivity(), kVar, kVar.resourceProvider, 2);
            kVar2.I = t2Var;
            t2Var.W1 = new qk0(kVar2, 15);
        }
        kVar2.I.g0.f0();
        kVar2.I.J1(1, false);
        t2 t2Var2 = kVar2.I;
        t2Var2.R1 = true;
        t2Var2.i1(new d4(kVar2, 17));
        kVar2.I.r1();
        t2 t2Var3 = kVar2.I;
        t2Var3.r = null;
        if (kVar2.visibleDialog != null) {
            t2Var3.show();
        } else {
            kVar2.showDialog(t2Var3);
        }
    }

    public static void Z(k kVar) {
        i iVar = kVar.n;
        if (iVar != null && iVar.isAttachedToWindow() && kVar.w) {
            i iVar2 = kVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(kVar.currentAccount).getGreetingsSticker();
            g gVar = new g(kVar, 2);
            if (greetingsSticker == null) {
                iVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = iVar2.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            iVar2.n.getImageReceiver().setDelegate(new co(iVar2, gVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, j6.lc, 1.0f);
            if (svgThumb != null) {
                iVar2.n.n(ImageLocation.getForDocument(greetingsSticker), fo.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                iVar2.n.j(ImageLocation.getForDocument(greetingsSticker), fo.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            iVar2.n.setOnClickListener(new bo(iVar2, greetingsSticker, 1));
        }
    }

    public static void b0(k kVar) {
        if (kVar.h.getParent() instanceof View) {
            int top = ((View) kVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (kVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            kVar.n.setScaleX(clamp);
            kVar.n.setScaleY(clamp);
            kVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            kVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final void U(ArrayList arrayList, w51 w51Var) {
        arrayList.add(i51.k(this.h));
        yh.r(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(i51.k(this.s));
        arrayList.add(i51.k(this.v));
        if (this.w) {
            arrayList.add(i51.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            i51 i51Var = new i51(3);
            i51Var.d = 1;
            i51Var.l = string;
            i51Var.G = str;
            arrayList.add(i51Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            i51 i51Var2 = new i51(3);
            i51Var2.d = 1;
            i51Var2.l = string2;
            i51Var2.G = document;
            arrayList.add(i51Var2);
        }
        arrayList.add(i51.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.H = !g02;
        if (!g02) {
            arrayList.add(i51.B(null));
            i51 e = i51.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e.r = true;
            arrayList.add(e);
        }
        i51 i51Var3 = new i51(8);
        i51Var3.l = null;
        arrayList.add(i51Var3);
    }

    @Override // org.telegram.ui.Components.b61
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.b61
    public final void W(i51 i51Var, View view) {
        int i10 = i51Var.d;
        if (i10 == 1) {
            y1 y1Var = new y1(getParentActivity(), getResourceProvider(), true, true);
            y1Var.y = new org.telegram.ui.web.m(7, this, view);
            int i11 = 0;
            y1Var.B = new g(this, i11);
            View[] viewPages = y1Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof ph.o1) {
                    ph.n1 n1Var = ((ph.o1) view2).c;
                    if (n1Var.E == null) {
                        n1Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(y1Var);
            return;
        }
        if (i10 == 2) {
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.b);
            AndroidUtilities.hideKeyboard(this.v.b);
            this.w = true;
            this.n.d("", "");
            i iVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            iVar.setSticker(greetingsSticker);
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.b61
    public final boolean X(i51 i51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b61, org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new i(context, this.currentAccount, this.x, getResourceProvider());
        ph phVar = new ph(this, context);
        this.h = phVar;
        phVar.setWillNotDraw(false);
        this.r = new w5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        ge geVar = new ge(context, 5);
        geVar.setScaleType(ImageView.ScaleType.MATRIX);
        geVar.setImageDrawable(l5.e(null, this.currentAccount, getUserConfig().getClientUserId(), j6.I.q()));
        this.h.addView(geVar, b6.e(-1, -1, 119));
        this.h.addView(this.n, b6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        j jVar = new j(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = jVar;
        jVar.h = true;
        jVar.setShowLimitOnFocus(true);
        j jVar2 = this.s;
        int i10 = j6.d6;
        jVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        j jVar3 = this.s;
        jVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(jVar3, 4);
        g3 g3Var = jVar3.b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new u2(gVar, 2));
        j jVar4 = new j(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = jVar4;
        jVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        j jVar5 = this.v;
        jVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(jVar5, 4);
        g3 g3Var2 = jVar5.b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        a61 a61Var = this.a;
        a61Var.V2.r = false;
        this.actionBar.setAdaptiveBackground(a61Var);
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = j6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new mr(mutate, new rp(j6.w0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new m.t2(this, 2));
        this.a.j(new lb0(this, 19));
        a61 a61Var2 = this.a;
        a61Var2.X2 = true;
        a61Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new i3(this.fragmentView, false, new org.telegram.ui.web.y0(this, 17));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z4) {
        if (this.f == null) {
            return;
        }
        boolean f02 = f0();
        this.f.setEnabled(f02);
        if (z4) {
            this.f.animate().alpha(f02 ? 1.0f : 0.0f).scaleX(f02 ? 1.0f : 0.0f).scaleY(f02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.f.setAlpha(f02 ? 1.0f : 0.0f);
            this.f.setScaleX(f02 ? 1.0f : 0.0f);
            this.f.setScaleY(f02 ? 1.0f : 0.0f);
        }
        a61 a61Var = this.a;
        if (a61Var == null || a61Var.V2 == null || this.H == (!g0())) {
            return;
        }
        a61 a61Var2 = this.a;
        if (a61Var2 != null && a61Var2.getChildCount() > 0) {
            View view = null;
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = -1;
            for (int i12 = 0; i12 < this.a.getChildCount(); i12++) {
                int R = RecyclerView.R(this.a.getChildAt(i12));
                View childAt = this.a.getChildAt(i12);
                if (R != -1 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    i11 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.b = i11;
                int top = view.getTop();
                this.c = top;
                if (this.b == 0 && top > AndroidUtilities.dp(88.0f)) {
                    this.c = AndroidUtilities.dp(88.0f);
                }
                this.a.U2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.V2.N(true);
        int i13 = this.b;
        if (i13 >= 0) {
            a61 a61Var3 = this.a;
            a61Var3.U2.h1(i13, this.c - a61Var3.getPaddingTop());
        }
    }

    public final boolean f0() {
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.D;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.v.getText().toString();
        String str2 = this.E;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z4 = this.w;
        if (((z4 || (document = this.x) == null) ? 0L : document.id) == this.F) {
            return (z4 || this.B == null) ? false : true;
        }
        return true;
    }

    public final boolean g0() {
        j jVar = this.s;
        if (jVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(jVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void h0() {
        TLRPC.Document document;
        mr mrVar = this.e;
        if (mrVar.c > 0.0f) {
            return;
        }
        mrVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.w && (this.x != null || this.B != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.B;
                if (inputDocument != null) {
                    tL_inputBusinessIntro2.sticker = inputDocument;
                } else {
                    tL_inputBusinessIntro2.sticker = getMessagesController().getInputDocument(this.x);
                }
            }
            if (userFull != null) {
                userFull.flags2 |= 16;
                TL_account.TL_businessIntro tL_businessIntro = new TL_account.TL_businessIntro();
                userFull.business_intro = tL_businessIntro;
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro3 = updatebusinessintro.intro;
                tL_businessIntro.title = tL_inputBusinessIntro3.title;
                tL_businessIntro.description = tL_inputBusinessIntro3.description;
                if (!this.w && (document = this.x) != null) {
                    tL_businessIntro.flags |= 1;
                    tL_businessIntro.sticker = document;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -17;
            userFull.business_intro = null;
        }
        getConnectionsManager().sendRequest(updatebusinessintro, new gf.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        w51 w51Var;
        if (this.G) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            j jVar = this.s;
            String str = tL_businessIntro.title;
            this.D = str;
            jVar.setText(str);
            j jVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.E = str2;
            jVar2.setText(str2);
            this.x = userFull.business_intro.sticker;
        } else {
            j jVar3 = this.s;
            this.D = "";
            jVar3.setText("");
            j jVar4 = this.v;
            this.E = "";
            jVar4.setText("");
            this.B = null;
            this.x = null;
        }
        TLRPC.Document document = this.x;
        this.F = document == null ? 0L : document.id;
        this.w = document == null;
        i iVar = this.n;
        if (iVar != null) {
            iVar.d(this.s.getText().toString(), this.v.getText().toString());
            i iVar2 = this.n;
            TLRPC.Document document2 = this.x;
            if (document2 == null || this.w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            iVar2.setSticker(document2);
        }
        if (this.w) {
            g gVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
        a61 a61Var = this.a;
        if (a61Var != null && (w51Var = a61Var.V2) != null) {
            w51Var.N(true);
        }
        this.G = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!f0()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new c2(this) { // from class: uf.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(d2 d2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.b.h0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new c2(this) { // from class: uf.h
            public final /* synthetic */ k b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void i(d2 d2Var, int i112) {
                switch (i11) {
                    case 0:
                        this.b.h0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        showDialog(alertDialog$Builder.a);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
