package pf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import ih.d4;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public boolean C;
    public i51 a;
    public fr b;
    public org.telegram.ui.ActionBar.w0 c;
    public boolean d;
    public FrameLayout e;
    public t0 f;
    public FrameLayout h;
    public v0 n;
    public up r;
    public d4 s;
    public boolean v;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public w0() {
        super(null);
        this.B = -4;
    }

    public final void T(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean U = U();
        this.c.setEnabled(U);
        if (z10) {
            this.c.animate().alpha(U ? 1.0f : 0.0f).scaleX(U ? 1.0f : 0.0f).scaleY(U ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.c.setAlpha(U ? 1.0f : 0.0f);
            this.c.setScaleX(U ? 1.0f : 0.0f);
            this.c.setScaleY(U ? 1.0f : 0.0f);
        }
        i51 i51Var = this.a;
        if (i51Var == null || i51Var.U2 == null) {
            return;
        }
        if (this.C != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.U2.N(true);
        }
    }

    public final boolean U() {
        TLRPC.GeoPoint geoPoint;
        if (((this.x == null && TextUtils.isEmpty(this.y)) ? false : true) != (this.w != null)) {
            return true;
        }
        boolean z10 = (this.x == null && TextUtils.isEmpty(this.y)) ? false : true;
        TLRPC.TL_businessLocation tL_businessLocation = this.w;
        if (z10 != ((tL_businessLocation == null || (tL_businessLocation.geo_point instanceof TLRPC.TL_geoPointEmpty)) ? false : true)) {
            return true;
        }
        if (!TextUtils.equals(this.y, tL_businessLocation != null ? tL_businessLocation.address : "")) {
            return true;
        }
        TLRPC.GeoPoint geoPoint2 = this.x;
        boolean z11 = geoPoint2 != null;
        TLRPC.TL_businessLocation tL_businessLocation2 = this.w;
        if (z11 != ((tL_businessLocation2 == null || tL_businessLocation2.geo_point == null) ? false : true)) {
            return true;
        }
        return geoPoint2 != null && (tL_businessLocation2 == null || (geoPoint = tL_businessLocation2.geo_point) == null || !((geoPoint instanceof TLRPC.TL_geoPointEmpty) || (geoPoint2.lat == geoPoint.lat && geoPoint2._long == geoPoint._long)));
    }

    public final void V() {
        if (this.b.c > 0.0f) {
            return;
        }
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z10) {
            if (!U()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                t0 t0Var = this.f;
                int i9 = -this.B;
                this.B = i9;
                AndroidUtilities.shakeViewSpring(t0Var, i9);
                return;
            }
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (!z10) {
            if (this.x != null) {
                updatebusinesslocation.flags |= 2;
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                updatebusinesslocation.geo_point = tL_inputGeoPoint;
                TLRPC.GeoPoint geoPoint = this.x;
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
            }
            updatebusinesslocation.flags |= 1;
            updatebusinesslocation.address = this.y;
            if (userFull != null) {
                userFull.flags2 |= 2;
                TLRPC.TL_businessLocation tL_businessLocation = new TLRPC.TL_businessLocation();
                userFull.business_location = tL_businessLocation;
                tL_businessLocation.address = this.y;
                if (this.x != null) {
                    tL_businessLocation.flags = 1 | tL_businessLocation.flags;
                    tL_businessLocation.geo_point = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint2 = userFull.business_location.geo_point;
                    TLRPC.GeoPoint geoPoint3 = this.x;
                    geoPoint2.lat = geoPoint3.lat;
                    geoPoint2._long = geoPoint3._long;
                }
            }
        } else if (userFull != null) {
            userFull.flags2 &= -3;
            userFull.business_location = null;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new s0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void W() {
        z41 z41Var;
        if (this.v) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.TL_businessLocation tL_businessLocation = userFull.business_location;
        this.w = tL_businessLocation;
        if (tL_businessLocation != null) {
            this.x = tL_businessLocation.geo_point;
            this.y = tL_businessLocation.address;
        } else {
            this.x = null;
            this.y = "";
        }
        t0 t0Var = this.f;
        if (t0Var != null) {
            this.d = true;
            t0Var.setText(this.y);
            t0 t0Var2 = this.f;
            t0Var2.setSelection(t0Var2.getText().length());
            this.d = false;
        }
        X();
        i51 i51Var = this.a;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        this.v = true;
    }

    public final void X() {
        d4 d4Var;
        v0 v0Var = this.n;
        if (v0Var == null || (d4Var = this.s) == null) {
            return;
        }
        if (this.x == null) {
            d4Var.setImageBitmap(null);
            return;
        }
        v0Var.setAlpha(0.0f);
        this.n.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.s.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.s.getMeasuredWidth();
        float f10 = AndroidUtilities.density;
        int i9 = (int) (measuredWidth / f10);
        int min = Math.min(2, (int) Math.ceil(f10));
        d4 d4Var2 = this.s;
        TLRPC.GeoPoint geoPoint = this.x;
        d4Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i9, min * 240, 15, min)), ta.b.c(i9, "_240"), this.r, null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.v8;
        int i10 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.b = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        t0 t0Var = new t0(this, getParentActivity());
        this.f = t0Var;
        t0Var.setTextSize(1, 17.0f);
        this.f.setHintTextColor(f6.w0(null, f6.H6, false));
        t0 t0Var2 = this.f;
        int i11 = f6.G6;
        t0Var2.setTextColor(f6.w0(null, i11, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(5);
        this.f.setSingleLine(false);
        this.f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180225);
        this.f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f.setCursorColor(f6.w0(null, i11, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.addTextChangedListener(new bh.f(this, 18));
        this.f.setFilters(new InputFilter[]{new u0()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, e6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i12 = f6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i12));
        t0 t0Var3 = this.f;
        if (t0Var3 != null) {
            this.d = true;
            t0Var3.setText(this.y);
            t0 t0Var4 = this.f;
            t0Var4.setSelection(t0Var4.getText().length());
            this.d = false;
        }
        this.s = new d4(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, f6.Pb, 0.2f);
        svgThumb.setColorKey(i11, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.s.getImageReceiver());
        up upVar = new up(svgThumb);
        this.r = upVar;
        upVar.setCallback(this.s);
        this.s.setBackgroundColor(getThemedColor(i12));
        this.n = new v0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.s, e6.c(-1.0f, -1));
        this.h.addView(this.n, e6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        X();
        i51 i51Var = new i51(this, new b8(this, 20), new r0(this, i10), null);
        this.a = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.a;
        i51Var2.U2.r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        W();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.userInfoDidLoad) {
            W();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !U();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!U() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new r0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new r0(this, 2));
            showDialog(alertDialog$Builder.a);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
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
