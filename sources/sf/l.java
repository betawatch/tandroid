package sf;

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
import lh.s2;
import m.t2;
import m.u2;
import nh.d6;
import nh.f6;
import nh.k2;
import nh.t4;
import nh.w3;
import nh.x1;
import nh.y1;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.t5;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.zn;
import org.telegram.ui.fi1;
import org.telegram.ui.ht;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l extends p51 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.InputDocument A;
    public boolean B;
    public String C;
    public String D;
    public long E;
    public boolean F;
    public s2 H;
    public ir e;
    public org.telegram.ui.ActionBar.w0 f;
    public sh h;
    public j n;
    public t5 r;
    public k s;
    public k v;
    public String y;
    public final h d = new h(this, 1);
    public boolean w = true;
    public TLRPC.Document x = getMediaDataController().getGreetingsSticker();
    public boolean G = g0();

    public static void Y(l lVar) {
        l lVar2;
        ht.q().T = null;
        if (lVar.getParentActivity() == null) {
            return;
        }
        if (lVar.getParentActivity() == null || lVar.getParentActivity() == null || lVar.H != null) {
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            s2 s2Var = new s2(lVar2, lVar.getParentActivity(), lVar, lVar.resourceProvider, 2);
            lVar2.H = s2Var;
            s2Var.V1 = new d6(lVar2, 23);
        }
        lVar2.H.f0.f0();
        lVar2.H.J1(1, false);
        s2 s2Var2 = lVar2.H;
        s2Var2.Q1 = true;
        s2Var2.i1(new t4(lVar2, 17));
        lVar2.H.r1();
        s2 s2Var3 = lVar2.H;
        s2Var3.r = null;
        if (lVar2.visibleDialog != null) {
            s2Var3.show();
        } else {
            lVar2.showDialog(s2Var3);
        }
    }

    public static void Z(l lVar) {
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
            jVar2.n.getImageReceiver().setDelegate(new ao(jVar2, hVar));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(greetingsSticker, g6.lc, 1.0f);
            if (svgThumb != null) {
                jVar2.n.n(ImageLocation.getForDocument(greetingsSticker), co.b(greetingsSticker), svgThumb, greetingsSticker);
            } else {
                jVar2.n.j(ImageLocation.getForDocument(greetingsSticker), co.b(greetingsSticker), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(greetingsSticker.thumbs, 90), greetingsSticker), null, 0, greetingsSticker);
            }
            jVar2.n.setOnClickListener(new zn(jVar2, greetingsSticker, 1));
        }
    }

    public static void b0(l lVar) {
        if (lVar.h.getParent() instanceof View) {
            int top = ((View) lVar.h.getParent()).getTop();
            float clamp = Utilities.clamp((top + r1) / (lVar.h.getMeasuredHeight() - AndroidUtilities.dp(36.0f)), 1.0f, 0.65f);
            lVar.n.setScaleX(clamp);
            lVar.n.setScaleY(clamp);
            lVar.n.setAlpha(Utilities.clamp(clamp * 2.0f, 1.0f, 0.0f));
            lVar.h.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final void U(ArrayList arrayList, k51 k51Var) {
        arrayList.add(w41.k(this.h));
        th.p(R.string.BusinessIntroHeader, arrayList);
        arrayList.add(w41.k(this.s));
        arrayList.add(w41.k(this.v));
        if (this.w) {
            arrayList.add(w41.f(LocaleController.getString(R.string.BusinessIntroSticker), LocaleController.getString(R.string.BusinessIntroStickerRandom), 1));
        } else if (this.y != null) {
            String string = LocaleController.getString(R.string.BusinessIntroSticker);
            String str = this.y;
            w41 w41Var = new w41(3);
            w41Var.d = 1;
            w41Var.l = string;
            w41Var.G = str;
            arrayList.add(w41Var);
        } else {
            String string2 = LocaleController.getString(R.string.BusinessIntroSticker);
            TLRPC.Document document = this.x;
            w41 w41Var2 = new w41(3);
            w41Var2.d = 1;
            w41Var2.l = string2;
            w41Var2.G = document;
            arrayList.add(w41Var2);
        }
        arrayList.add(w41.B(LocaleController.getString(R.string.BusinessIntroInfo)));
        boolean g02 = g0();
        this.G = !g02;
        if (!g02) {
            arrayList.add(w41.B(null));
            w41 e10 = w41.e(2, LocaleController.getString(R.string.BusinessIntroReset));
            e10.r = true;
            arrayList.add(e10);
        }
        w41 w41Var3 = new w41(8);
        w41Var3.l = null;
        arrayList.add(w41Var3);
    }

    @Override // org.telegram.ui.Components.p51
    public final CharSequence V() {
        return LocaleController.getString(R.string.BusinessIntro);
    }

    @Override // org.telegram.ui.Components.p51
    public final void W(w41 w41Var, View view) {
        int i10 = w41Var.d;
        if (i10 == 1) {
            k2 k2Var = new k2(getParentActivity(), getResourceProvider(), true, true);
            k2Var.y = new fi1(7, this, view);
            int i11 = 0;
            k2Var.A = new h(this, i11);
            View[] viewPages = k2Var.f.getViewPages();
            while (i11 < viewPages.length) {
                View view2 = viewPages[i11];
                if (view2 instanceof y1) {
                    x1 x1Var = ((y1) view2).c;
                    if (x1Var.D == null) {
                        x1Var.D(null);
                    }
                }
                i11++;
            }
            showDialog(k2Var);
            return;
        }
        if (i10 == 2) {
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
            e0(true);
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean X(w41 w41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        getUserConfig().getCurrentUser();
        this.n = new j(context, this.currentAccount, this.x, getResourceProvider());
        sh shVar = new sh(this, context);
        this.h = shVar;
        shVar.setWillNotDraw(false);
        this.r = new t5(this.n, this.h, AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
        this.n.setBackground(new ColorDrawable(0));
        je jeVar = new je(context, 5);
        jeVar.setScaleType(ImageView.ScaleType.MATRIX);
        jeVar.setImageDrawable(f6.e(null, this.currentAccount, getUserConfig().getClientUserId(), g6.I.q()));
        this.h.addView(jeVar, i7.f6.e(-1, -1, 119));
        this.h.addView(this.n, i7.f6.d(-2, -2.0f, 17, 42.0f, 18.0f, 42.0f, 18.0f));
        k kVar = new k(this, context, LocaleController.getString(R.string.BusinessIntroTitleHint), getMessagesController().introTitleLengthLimit, this.resourceProvider, 0);
        this.s = kVar;
        kVar.h = true;
        kVar.setShowLimitOnFocus(true);
        k kVar2 = this.s;
        int i10 = g6.d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        this.s.setDivider(true);
        k kVar3 = this.s;
        kVar3.getClass();
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(kVar3, 4);
        e3 e3Var = kVar3.b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new u2(gVar, 2));
        k kVar4 = new k(this, context, LocaleController.getString(R.string.BusinessIntroMessageHint), getMessagesController().introDescriptionLengthLimit, this.resourceProvider, 1);
        this.v = kVar4;
        kVar4.setShowLimitOnFocus(true);
        this.v.setBackgroundColor(getThemedColor(i10));
        this.v.setDivider(true);
        k kVar5 = this.v;
        kVar5.getClass();
        org.telegram.ui.Cells.g gVar2 = new org.telegram.ui.Cells.g(kVar5, 4);
        e3 e3Var2 = kVar5.b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new u2(gVar2, 2));
        this.n.d("", "");
        super.createView(context);
        this.a.p1();
        o51 o51Var = this.a;
        o51Var.U2.r = false;
        this.actionBar.setAdaptiveBackground(o51Var);
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 7));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = g6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        this.e = new ir(mutate, new np(g6.w0(null, i11, false)));
        this.f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        e0(false);
        this.a.addOnLayoutChangeListener(new t2(this, 2));
        this.a.j(new h00(this, 19));
        o51 o51Var2 = this.a;
        o51Var2.W2 = true;
        o51Var2.setClipChildren(false);
        View view = this.fragmentView;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        i0();
        new w3(this.fragmentView, false, new nh.b0(this, 17));
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
        o51 o51Var = this.a;
        if (o51Var == null || o51Var.U2 == null || this.G == (!g0())) {
            return;
        }
        o51 o51Var2 = this.a;
        if (o51Var2 != null && o51Var2.getChildCount() > 0) {
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
            o51 o51Var3 = this.a;
            o51Var3.T2.h1(i13, this.c - o51Var3.getPaddingTop());
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
        k kVar = this.s;
        if (kVar == null || this.v == null) {
            return true;
        }
        return TextUtils.isEmpty(kVar.getText()) && TextUtils.isEmpty(this.v.getText()) && this.w;
    }

    public final void h0() {
        TLRPC.Document document;
        ir irVar = this.e;
        if (irVar.c > 0.0f) {
            return;
        }
        irVar.a(1.0f);
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
        getConnectionsManager().sendRequest(updatebusinessintro, new ef.a(this, 24));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void i0() {
        k51 k51Var;
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
        o51 o51Var = this.a;
        if (o51Var != null && (k51Var = o51Var.U2) != null) {
            k51Var.N(true);
        }
        this.F = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new b2(this) { // from class: sf.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(c2 c2Var, int i11) {
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
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new b2(this) { // from class: sf.i
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void g(c2 c2Var, int i112) {
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
