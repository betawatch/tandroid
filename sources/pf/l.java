package pf;

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
import g7.e6;
import ih.u2;
import java.util.ArrayList;
import kh.a2;
import kh.b2;
import kh.b4;
import kh.b8;
import kh.i9;
import kh.n2;
import kh.r6;
import m.t2;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.s5;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ei1;
import org.telegram.ui.ht;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends d51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument A;
    public boolean B;
    public String C;
    public String D;
    public long E;
    public boolean F;
    public u2 H;
    public fr e;
    public org.telegram.ui.ActionBar.w0 f;
    public ph h;
    public j n;
    public s5 r;
    public k s;
    public k v;
    public String y;
    public final h d = new h(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean G = f0();

    public static void X(l lVar) {
        l lVar2;
        ht.q().T = null;
        if (lVar.getParentActivity() == null) {
            return;
        }
        if (lVar.getParentActivity() == null || lVar.getParentActivity() == null || lVar.H != null) {
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            u2 u2Var = new u2(lVar2, lVar.getParentActivity(), lVar, lVar.resourceProvider, 2);
            lVar2.H = u2Var;
            u2Var.V1 = new n5.e0(lVar2, 14);
        }
        lVar2.H.f0.e0();
        lVar2.H.J1(1, false);
        u2 u2Var2 = lVar2.H;
        u2Var2.Q1 = true;
        u2Var2.i1(new b8(lVar2, 16));
        lVar2.H.r1();
        u2 u2Var3 = lVar2.H;
        u2Var3.r = null;
        if (lVar2.visibleDialog != null) {
            u2Var3.show();
        } else {
            lVar2.showDialog(u2Var3);
        }
    }

    public static void Y(l lVar) {
        j jVar = lVar.n;
        if (jVar != null && jVar.isAttachedToWindow() && lVar.w) {
            j jVar2 = lVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(lVar.currentAccount).getGreetingsSticker();
            h hVar = new h(lVar, 2);
            if (greetingsSticker == null) {
                jVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = jVar2.B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            jVar2.n.getImageReceiver().setDelegate(new wn(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, f6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.n.n(ImageLocation.getForDocument(greetingsSticker), yn.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.n.j(ImageLocation.getForDocument(greetingsSticker), yn.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.n.setOnClickListener(new vn(jVar2, greetingsSticker, 1));
        }
    }

    public static void a0(l lVar) {
        if (lVar.h.getParent() instanceof View) {
            int top = ((View) lVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (lVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            lVar.n.setScaleX(clamp);
            lVar.n.setScaleY(clamp);
            lVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            lVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final void T(ArrayList arrayList, z41 z41Var) {
        arrayList.add(l41.k(this.h));
        j2.l(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(l41.k(this.s));
        arrayList.add(l41.k(this.v));
        if (this.w) {
            arrayList.add(l41.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            l41 l41Var = new l41(3);
            l41Var.d = 1;
            l41Var.l = string;
            l41Var.G = str;
            arrayList.add(l41Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            l41 l41Var2 = new l41(3);
            l41Var2.d = 1;
            l41Var2.l = string2;
            l41Var2.G = document;
            arrayList.add(l41Var2);
        }
        arrayList.add(l41.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean f02 = f0();
        this.G = !f02;
        if (!f02) {
            arrayList.add(l41.B(null));
            l41 e10 = l41.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e10.r = true;
            arrayList.add(e10);
        }
        l41 l41Var3 = new l41(8);
        l41Var3.l = null;
        arrayList.add(l41Var3);
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence U() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.d51
    public final void V(l41 l41Var, View view) {
        int i9 = l41Var.d;
        if (i9 == 1) {
            n2 n2Var = new n2(getParentActivity(), getResourceProvider(), true, true);
            n2Var.y = new ei1(4, this, view);
            int i10 = 0;
            n2Var.A = new h(this, i10);
            View[] viewPages = n2Var.f.getViewPages();
            while (i10 < viewPages.length) {
                View view2 = viewPages[i10];
                if (view2 instanceof b2) {
                    a2 a2Var = ((b2) view2).c;
                    if (a2Var.D == null) {
                        a2Var.D(null);
                    }
                }
                i10++;
            }
            showDialog(n2Var);
            return;
        }
        if (i9 == 2) {
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.b);
            AndroidUtilities.hideKeyboard(this.v.b);
            this.w = true;
            this.n.d("", "");
            j jVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            jVar.setSticker(greetingsSticker);
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
            d0(true);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean W(l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new j(context, this.currentAccount, this.x, getResourceProvider());
        ph phVar = new ph(this, context);
        this.h = phVar;
        phVar.setWillNotDraw(false);
        this.r = new s5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        ge geVar = new ge(context, 5);
        geVar.setScaleType(ImageView.ScaleType.MATRIX);
        geVar.setImageDrawable(r6.e(null, this.currentAccount, getUserConfig().getClientUserId(), f6.I.q()));
        this.h.addView(geVar, e6.e(-1, -1, 119));
        this.h.addView(this.n, e6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        k kVar = new k(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = kVar;
        kVar.h = true;
        kVar.setShowLimitOnFocus(true);
        k kVar2 = this.s;
        int i9 = f6.d6;
        kVar2.setBackgroundColor(getThemedColor(i9));
        this.s.setDivider(true);
        k kVar3 = this.s;
        kVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(kVar3, 4);
        h3 h3Var = kVar3.b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(gVar, 2));
        k kVar4 = new k(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = kVar4;
        kVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i9));
        this.v.setDivider(true);
        k kVar5 = this.v;
        kVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(kVar5, 4);
        h3 h3Var2 = kVar5.b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        c51 c51Var = this.a;
        c51Var.U2.r = false;
        this.actionBar.setAdaptiveBackground(c51Var);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 6));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new fr(mutate, new jp(f6.w0(null, i10, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        d0(false);
        this.a.addOnLayoutChangeListener(new t2(this, 2));
        this.a.j(new kn(this, 18));
        c51 c51Var2 = this.a;
        c51Var2.W2 = true;
        c51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        h0();
        new b4(this.fragmentView, false, new i9(this, 10));
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        if (this.f == null) {
            return;
        }
        boolean e02 = e0();
        this.f.setEnabled(e02);
        if (z10) {
            this.f.animate().alpha(e02 ? 1.0f : 0.0f).scaleX(e02 ? 1.0f : 0.0f).scaleY(e02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.f.setAlpha(e02 ? 1.0f : 0.0f);
            this.f.setScaleX(e02 ? 1.0f : 0.0f);
            this.f.setScaleY(e02 ? 1.0f : 0.0f);
        }
        c51 c51Var = this.a;
        if (c51Var == null || c51Var.U2 == null || this.G == (!f0())) {
            return;
        }
        c51 c51Var2 = this.a;
        if (c51Var2 != null && c51Var2.getChildCount() > 0) {
            View view = null;
            int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = -1;
            for (int i11 = 0; i11 < this.a.getChildCount(); i11++) {
                int R = RecyclerView.R(this.a.getChildAt(i11));
                View childAt = this.a.getChildAt(i11);
                if (R != -1 && childAt.getTop() < i9) {
                    i9 = childAt.getTop();
                    i10 = R;
                    view = childAt;
                }
            }
            if (view != null) {
                this.b = i10;
                int top = view.getTop();
                this.c = top;
                if (this.b == 0 && top > AndroidUtilities.dp(88.0f)) {
                    this.c = AndroidUtilities.dp(88.0f);
                }
                this.a.T2.h1(i10, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.U2.N(true);
        int i12 = this.b;
        if (i12 >= 0) {
            c51 c51Var3 = this.a;
            c51Var3.T2.h1(i12, this.c - c51Var3.getPaddingTop());
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad) {
            h0();
        }
    }

    public final boolean e0() {
        TLRPC.Document document;
        String charSequence = this.s.getText().toString();
        String str = this.C;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(charSequence, str)) {
            return true;
        }
        String charSequence2 = this.v.getText().toString();
        String str2 = this.D;
        if (!TextUtils.equals(charSequence2, str2 != null ? str2 : "")) {
            return true;
        }
        boolean z10 = this.w;
        if (((z10 || (document = this.x) == null) ? 0L : document.id) == this.E) {
            return (z10 || this.A == null) ? false : true;
        }
        return true;
    }

    public final boolean f0() {
        k kVar = this.s;
        if (kVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(kVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void g0() {
        TLRPC.Document document;
        fr frVar = this.e;
        if (frVar.c > 0.0f) {
            return;
        }
        frVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!f0()) {
            updatebusinessintro.flags |= 1;
            TL_account.TL_inputBusinessIntro tL_inputBusinessIntro = new TL_account.TL_inputBusinessIntro();
            updatebusinessintro.intro = tL_inputBusinessIntro;
            tL_inputBusinessIntro.title = this.s.getText().toString();
            updatebusinessintro.intro.description = this.v.getText().toString();
            if (!this.w && (this.x != null || this.A != null)) {
                TL_account.TL_inputBusinessIntro tL_inputBusinessIntro2 = updatebusinessintro.intro;
                tL_inputBusinessIntro2.flags |= 1;
                TLRPC.InputDocument inputDocument = this.A;
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
        getConnectionsManager().sendRequest(updatebusinessintro, new bf.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void h0() {
        z41 z41Var;
        if (this.F) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessIntro tL_businessIntro = userFull.business_intro;
        if (tL_businessIntro != null) {
            k kVar = this.s;
            String str = tL_businessIntro.title;
            this.C = str;
            kVar.setText(str);
            k kVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.D = str2;
            kVar2.setText(str2);
            this.x = userFull.business_intro.sticker;
        } else {
            k kVar3 = this.s;
            this.C = "";
            kVar3.setText("");
            k kVar4 = this.v;
            this.D = "";
            kVar4.setText("");
            this.A = null;
            this.x = null;
        }
        TLRPC.Document document = this.x;
        this.E = document == null ? 0L : document.id;
        this.w = document == null;
        j jVar = this.n;
        if (jVar != null) {
            jVar.d(this.s.getText().toString(), this.v.getText().toString());
            j jVar2 = this.n;
            TLRPC.Document document2 = this.x;
            if (document2 == null || this.w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            jVar2.setSticker(document2);
        }
        if (this.w) {
            h hVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(hVar);
            AndroidUtilities.runOnUIThread(hVar, 5000L);
        }
        c51 c51Var = this.a;
        if (c51Var != null && (z41Var = c51Var.U2) != null) {
            z41Var.N(true);
        }
        this.F = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!e0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
        final int i9 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) { // from class: pf.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(c2 c2Var, int i10) {
                switch (i9) {
                    case 0:
                        this.b.g0();
                        break;
                    default:
                        this.b.finishFragment();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.b2(this) { // from class: pf.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(c2 c2Var, int i102) {
                switch (i10) {
                    case 0:
                        this.b.g0();
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
