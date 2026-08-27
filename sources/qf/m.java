package qf;

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
import h7.z5;
import java.util.ArrayList;
import jh.t2;
import lh.a4;
import lh.a8;
import lh.l2;
import lh.n6;
import lh.q6;
import lh.y1;
import lh.z1;
import m.u2;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.xm;
import org.telegram.ui.di1;
import org.telegram.ui.ed1;
import org.telegram.ui.kt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m extends f51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument A;
    public boolean B;
    public String C;
    public String D;
    public long E;
    public boolean F;
    public t2 H;
    public dr e;
    public org.telegram.ui.ActionBar.v0 f;
    public lh h;
    public k n;
    public t5 r;
    public l s;
    public l v;
    public String y;
    public final i d = new i(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean G = g0();

    public static void Y(m mVar) {
        m mVar2;
        kt.q().T = null;
        if (mVar.getParentActivity() == null) {
            return;
        }
        if (mVar.getParentActivity() == null || mVar.getParentActivity() == null || mVar.H != null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            t2 t2Var = new t2(mVar2, mVar.getParentActivity(), mVar, mVar.resourceProvider, 2);
            mVar2.H = t2Var;
            t2Var.V1 = new n2.b0(mVar2, 16);
        }
        mVar2.H.f0.f0();
        mVar2.H.J1(1, false);
        t2 t2Var2 = mVar2.H;
        t2Var2.Q1 = true;
        t2Var2.i1(new a8(mVar2, 16));
        mVar2.H.r1();
        t2 t2Var3 = mVar2.H;
        t2Var3.r = null;
        if (mVar2.visibleDialog != null) {
            t2Var3.show();
        } else {
            mVar2.showDialog(t2Var3);
        }
    }

    public static void Z(m mVar) {
        k kVar = mVar.n;
        if (kVar != null && kVar.isAttachedToWindow() && mVar.w) {
            k kVar2 = mVar.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(mVar.currentAccount).getGreetingsSticker();
            i iVar = new i(mVar, 2);
            if (greetingsSticker == null) {
                kVar2.getClass();
                return;
            }
            AnimatorSet animatorSet = kVar2.B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            kVar2.n.getImageReceiver().setDelegate(new un(kVar2, iVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, g6.lc, 1.0f);
            if (svgThumb != null) {
                kVar2.n.n(ImageLocation.getForDocument(greetingsSticker), wn.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                kVar2.n.j(ImageLocation.getForDocument(greetingsSticker), wn.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            kVar2.n.setOnClickListener(new tn(kVar2, greetingsSticker, 1));
        }
    }

    public static void b0(m mVar) {
        if (mVar.h.getParent() instanceof View) {
            int top = ((View) mVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (mVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            mVar.n.setScaleX(clamp);
            mVar.n.setScaleY(clamp);
            mVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            mVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.f51
    public final void U(ArrayList arrayList, b51 b51Var) {
        arrayList.add(n41.k(this.h));
        pa.o(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(n41.k(this.s));
        arrayList.add(n41.k(this.v));
        if (this.w) {
            arrayList.add(n41.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            n41 n41Var = new n41(3);
            n41Var.d = 1;
            n41Var.l = string;
            n41Var.G = str;
            arrayList.add(n41Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            n41 n41Var2 = new n41(3);
            n41Var2.d = 1;
            n41Var2.l = string2;
            n41Var2.G = document;
            arrayList.add(n41Var2);
        }
        arrayList.add(n41.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.G = !g02;
        if (!g02) {
            arrayList.add(n41.B(null));
            n41 e9 = n41.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e9.r = true;
            arrayList.add(e9);
        }
        n41 n41Var3 = new n41(8);
        n41Var3.l = null;
        arrayList.add(n41Var3);
    }

    @Override // org.telegram.ui.Components.f51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.f51
    public final void W(n41 n41Var, View view) {
        int i10 = n41Var.d;
        if (i10 == 1) {
            l2 l2Var = new l2(getParentActivity(), getResourceProvider(), true, true);
            l2Var.y = new di1(5, this, view);
            int i11 = 0;
            l2Var.A = new i(this, i11);
            View[] viewPages = l2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof z1) {
                    y1 y1Var = ((z1) view2).c;
                    if (y1Var.D == null) {
                        y1Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(l2Var);
            return;
        }
        if (i10 == 2) {
            this.s.setText("");
            this.v.setText("");
            AndroidUtilities.hideKeyboard(this.s.b);
            AndroidUtilities.hideKeyboard(this.v.b);
            this.w = true;
            this.n.d("", "");
            k kVar = this.n;
            TLRPC.Document greetingsSticker = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            this.x = greetingsSticker;
            kVar.setSticker(greetingsSticker);
            i iVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 5000L);
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.f51
    public final boolean X(n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new k(context, this.currentAccount, this.x, getResourceProvider());
        lh lhVar = new lh(this, context);
        this.h = lhVar;
        lhVar.setWillNotDraw(false);
        this.r = new t5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        ce ceVar = new ce(context, 5);
        ceVar.setScaleType(ImageView.ScaleType.MATRIX);
        ceVar.setImageDrawable(q6.e(null, this.currentAccount, getUserConfig().getClientUserId(), g6.I.q()));
        this.h.addView(ceVar, z5.e(-1, -1, 119));
        this.h.addView(this.n, z5.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        l lVar = new l(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = lVar;
        lVar.h = true;
        lVar.setShowLimitOnFocus(true);
        l lVar2 = this.s;
        int i10 = g6.d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        l lVar3 = this.s;
        lVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(lVar3, 4);
        e3 e3Var = lVar3.b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new u2(gVar, 2));
        l lVar4 = new l(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = lVar4;
        lVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        l lVar5 = this.v;
        lVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(lVar5, 4);
        e3 e3Var2 = lVar5.b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        e51 e51Var = this.a;
        e51Var.U2.r = false;
        this.actionBar.setAdaptiveBackground(e51Var);
        this.actionBar.setActionBarMenuOnItemClick(new ed1(7, this));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new dr(mutate, new hp(g6.w0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new m.t2(this, 2));
        this.a.j(new xm(this, 19));
        e51 e51Var2 = this.a;
        e51Var2.W2 = true;
        e51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new a4(this.fragmentView, false, new n6(this, 12));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            i0();
        }
    }

    public final void e0(boolean z10) {
        if (this.f == null) {
            return;
        }
        boolean f02 = f0();
        this.f.setEnabled(f02);
        if (z10) {
            this.f.animate().alpha(f02 ? 1.0f : 0.0f).scaleX(f02 ? 1.0f : 0.0f).scaleY(f02 ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.f.setAlpha(f02 ? 1.0f : 0.0f);
            this.f.setScaleX(f02 ? 1.0f : 0.0f);
            this.f.setScaleY(f02 ? 1.0f : 0.0f);
        }
        e51 e51Var = this.a;
        if (e51Var == null || e51Var.U2 == null || this.G == (!g0())) {
            return;
        }
        e51 e51Var2 = this.a;
        if (e51Var2 != null && e51Var2.getChildCount() > 0) {
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
                this.a.T2.h1(i11, view.getTop() - this.a.getPaddingTop());
            }
        }
        this.a.U2.N(true);
        int i13 = this.b;
        if (i13 >= 0) {
            e51 e51Var3 = this.a;
            e51Var3.T2.h1(i13, this.c - e51Var3.getPaddingTop());
        }
    }

    public final boolean f0() {
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

    public final boolean g0() {
        l lVar = this.s;
        if (lVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(lVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void h0() {
        TLRPC.Document document;
        dr drVar = this.e;
        if (drVar.c > 0.0f) {
            return;
        }
        drVar.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessIntro updatebusinessintro = new TL_account.updateBusinessIntro();
        if (!g0()) {
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
        getConnectionsManager().sendRequest(updatebusinessintro, new cf.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        b51 b51Var;
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
            l lVar = this.s;
            String str = tL_businessIntro.title;
            this.C = str;
            lVar.setText(str);
            l lVar2 = this.v;
            String str2 = userFull.business_intro.description;
            this.D = str2;
            lVar2.setText(str2);
            this.x = userFull.business_intro.sticker;
        } else {
            l lVar3 = this.s;
            this.C = "";
            lVar3.setText("");
            l lVar4 = this.v;
            this.D = "";
            lVar4.setText("");
            this.A = null;
            this.x = null;
        }
        TLRPC.Document document = this.x;
        this.E = document == null ? 0L : document.id;
        this.w = document == null;
        k kVar = this.n;
        if (kVar != null) {
            kVar.d(this.s.getText().toString(), this.v.getText().toString());
            k kVar2 = this.n;
            TLRPC.Document document2 = this.x;
            if (document2 == null || this.w) {
                document2 = MediaDataController.getInstance(this.currentAccount).getGreetingsSticker();
            }
            kVar2.setSticker(document2);
        }
        if (this.w) {
            i iVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 5000L);
        }
        e51 e51Var = this.a;
        if (e51Var != null && (b51Var = e51Var.U2) != null) {
            b51Var.N(true);
        }
        this.F = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (!f0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessIntroUnsavedChanges);
        final int i10 = 0;
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a2(this) { // from class: qf.j
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(b2 b2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a2(this) { // from class: qf.j
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.a2
            public final void f(b2 b2Var, int i112) {
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
