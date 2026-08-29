package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import lh.y3;
import nh.t4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.yp;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int B;
    public boolean C;
    public u51 a;
    public ir b;
    public org.telegram.ui.ActionBar.w0 c;
    public boolean d;
    public FrameLayout e;
    public s0 f;
    public FrameLayout h;
    public u0 n;
    public yp r;
    public y3 s;
    public boolean v;
    public TLRPC.TL_businessLocation w;
    public TLRPC.GeoPoint x;
    public String y;

    public v0() {
        super(null);
        this.B = -4;
    }

    public final void U(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean V = V();
        this.c.setEnabled(V);
        if (z10) {
            this.c.animate().alpha(V ? 1.0f : 0.0f).scaleX(V ? 1.0f : 0.0f).scaleY(V ? 1.0f : 0.0f).setDuration(180L).start();
        } else {
            this.c.setAlpha(V ? 1.0f : 0.0f);
            this.c.setScaleX(V ? 1.0f : 0.0f);
            this.c.setScaleY(V ? 1.0f : 0.0f);
        }
        u51 u51Var = this.a;
        if (u51Var == null || u51Var.U2 == null) {
            return;
        }
        if (this.C != ((this.w == null || (this.x == null && TextUtils.isEmpty(this.y))) ? false : true)) {
            this.a.U2.N(true);
        }
    }

    public final boolean V() {
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

    public final void W() {
        if (this.b.c > 0.0f) {
            return;
        }
        boolean z10 = this.x == null && TextUtils.isEmpty(this.y);
        if (!z10) {
            if (!V()) {
                finishFragment();
                return;
            }
            String str = this.y;
            String trim = str == null ? "" : str.trim();
            if (TextUtils.isEmpty(trim) || trim.length() > 96) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                s0 s0Var = this.f;
                int i10 = -this.B;
                this.B = i10;
                AndroidUtilities.shakeViewSpring(s0Var, i10);
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
        getConnectionsManager().sendRequest(updatebusinesslocation, new r0(this, 0));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void X() {
        k51 k51Var;
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
        s0 s0Var = this.f;
        if (s0Var != null) {
            this.d = true;
            s0Var.setText(this.y);
            s0 s0Var2 = this.f;
            s0Var2.setSelection(s0Var2.getText().length());
            this.d = false;
        }
        Y();
        u51 u51Var = this.a;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
        }
        this.v = true;
    }

    public final void Y() {
        y3 y3Var;
        u0 u0Var = this.n;
        if (u0Var == null || (y3Var = this.s) == null) {
            return;
        }
        if (this.x == null) {
            y3Var.setImageBitmap(null);
            return;
        }
        u0Var.setAlpha(0.0f);
        this.n.setTranslationY(-AndroidUtilities.dp(12.0f));
        int measuredWidth = this.s.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : this.s.getMeasuredWidth();
        float f9 = AndroidUtilities.density;
        int i10 = (int) (measuredWidth / f9);
        int min = Math.min(2, (int) Math.ceil(f9));
        y3 y3Var2 = this.s;
        TLRPC.GeoPoint geoPoint = this.x;
        y3Var2.n(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint.lat, geoPoint._long, 0L, min * i10, min * 240, 15, min)), u3.c.d(i10, "_240"), this.r, null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessLocation));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.v8;
        int i11 = 0;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.b = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.a7, false));
        s0 s0Var = new s0(this, getParentActivity());
        this.f = s0Var;
        s0Var.setTextSize(1, 17.0f);
        this.f.setHintTextColor(g6.w0(null, g6.H6, false));
        s0 s0Var2 = this.f;
        int i12 = g6.G6;
        s0Var2.setTextColor(g6.w0(null, i12, false));
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(5);
        this.f.setSingleLine(false);
        this.f.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        this.f.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.f.setInputType(180225);
        this.f.setHint(LocaleController.getString(R.string.BusinessLocationAddress));
        this.f.setCursorColor(g6.w0(null, i12, false));
        this.f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.addTextChangedListener(new bh.c(this, 19));
        this.f.setFilters(new InputFilter[]{new t0()});
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, f6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = g6.d6;
        frameLayout3.setBackgroundColor(getThemedColor(i13));
        s0 s0Var3 = this.f;
        if (s0Var3 != null) {
            this.d = true;
            s0Var3.setText(this.y);
            s0 s0Var4 = this.f;
            s0Var4.setSelection(s0Var4.getText().length());
            this.d = false;
        }
        this.s = new y3(this, context, 11);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, g6.Pb, 0.2f);
        svgThumb.setColorKey(i12, getResourceProvider());
        svgThumb.setAspectCenter(true);
        svgThumb.setParent(this.s.getImageReceiver());
        yp ypVar = new yp(svgThumb);
        this.r = ypVar;
        ypVar.setCallback(this.s);
        this.s.setBackgroundColor(getThemedColor(i13));
        this.n = new u0(this, context);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.h = frameLayout4;
        frameLayout4.addView(this.s, f6.c(-1.0f, -1));
        this.h.addView(this.n, f6.d(-2, -2.0f, 17, 0.0f, -31.0f, 0.0f, 0.0f));
        Y();
        u51 u51Var = new u51(this, new t4(this, 21), new q0(this, i11), null);
        this.a = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.a;
        u51Var2.U2.r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !V();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.x == null && TextUtils.isEmpty(this.y);
        if (!V() || z11) {
            return super.onBackPressed(z10);
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.UnsavedChanges);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.BusinessLocationUnsavedChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 2));
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
