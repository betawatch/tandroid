// default package

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.TextView;
import java.io.EOFException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z24 implements vd4, co7, ml4, r9, wh5, y60, x74, kt8, yt7, u30, b79, s58, ir9, eob, o7, ll5 {
    public final /* synthetic */ byte a;
    public Object b;

    public z24(byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.b = mm5.p();
                break;
        }
    }

    public static boolean U(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String e0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // u30
    public final void A2(long j, int i, long j2) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new l30((Object) tg2Var, i, j, j2, (byte) 0));
        }
    }

    @Override // eob
    public final void B1(int i, long j) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null || (arrayList = f4bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((f4b) zi8Var.d.T.get(i)).X = j;
    }

    @Override // u30
    public final void D(pd5 pd5Var) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r2 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 == 3) goto L18;
     */
    @Override // co7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D2(Object obj) {
        Integer num = (Integer) obj;
        bg4 bg4Var = (bg4) this.b;
        Handler handler = bg4Var.B0;
        ez3 ez3Var = bg4Var.C0;
        handler.removeCallbacks(ez3Var);
        int intValue = num.intValue();
        if (bg4Var.G0 != null) {
            int i = bg4Var.D0.w;
            Context n = bg4Var.n();
            Drawable drawable = null;
            if (n == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i2 = R.drawable.fingerprint_dialog_fp_icon;
                if (i != 0 || intValue != 1) {
                    if (i == 1 && intValue == 2) {
                        i2 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i == 2) {
                        }
                        if (i == 1) {
                        }
                    }
                }
                drawable = n.getDrawable(i2);
            }
            if (drawable != null) {
                bg4Var.G0.setImageDrawable(drawable);
                if ((i != 0 || intValue != 1) && ((i == 1 && intValue == 2) || (i == 2 && intValue == 1))) {
                    zf4.a(drawable);
                }
                bg4Var.D0.w = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = bg4Var.H0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? bg4Var.E0 : bg4Var.F0);
        }
        handler.postDelayed(ez3Var, 2000L);
    }

    @Override // u30
    public final void E1() {
        ((fk6) this.b).l1 = true;
    }

    @Override // x74
    public final void F(float f, int i) {
        ((x46) this.b).h(f);
    }

    @Override // ml4
    public final Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public final Integer H(String str) {
        String R = R(str);
        if (TextUtils.isEmpty(R)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(R));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + e0(str) + "(" + R + ") into an int");
            return null;
        }
    }

    @Override // eob
    public final void H1(long j) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.D = j;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    public final JSONArray I(String str) {
        String R = R(str);
        if (TextUtils.isEmpty(R)) {
            return null;
        }
        try {
            return new JSONArray(R);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + e0(str) + ": " + R + ", falling back to default");
            return null;
        }
    }

    public final String J(Resources resources, String str, String str2) {
        String[] strArr;
        String R = R(str2);
        if (!TextUtils.isEmpty(R)) {
            return R;
        }
        String R2 = R(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(R2)) {
            return null;
        }
        int identifier = resources.getIdentifier(R2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", e0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray I = I(str2.concat("_loc_args"));
        if (I == null) {
            strArr = null;
        } else {
            int length = I.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = I.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + e0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // eob
    public final void K() {
        zi8 zi8Var = (zi8) this.b;
        zi8Var.s(null, null, true);
        t7b t7bVar = ((i7b) zi8Var).D0;
        i7b i7bVar = t7bVar.Y0;
        if (i7bVar != null) {
            i7bVar.s(null, null, true);
        }
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            x6bVar.n0();
        }
        j7b j7bVar = t7bVar.d1;
        if (j7bVar != null) {
            j7bVar.setHasRoundVideo(false);
        }
        f4b f4bVar = t7bVar.L1;
        if (f4bVar != null) {
            File file = f4bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                f4bVar = t7bVar.L1;
                f4bVar.o0 = null;
            }
            if (f4bVar.p0 != null) {
                try {
                    new File(t7bVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                t7bVar.L1.p0 = null;
            }
        }
    }

    @Override // u30
    public final void L() {
        ((fk6) this.b).n1 = true;
    }

    @Override // eob
    public final void L0(long j) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.r0 = j;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override // eob
    public final void M(boolean z, float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar != null) {
            f4bVar.Z = f;
            f4bVar.j = true;
            lbc lbcVar = zi8Var.e;
            if (lbcVar == null || lbcVar.U() == -9223372036854775807L) {
                return;
            }
            zi8Var.m((long) (f * zi8Var.e.U()));
        }
    }

    @Override // yt7
    public final void O(float f) {
        dj6 dj6Var = (dj6) this.b;
        k38.e(dj6Var.a).k("-1", f);
        dj6Var.e.setBrushSize(f);
    }

    @Override // b79
    public final void P() {
        x6b x6bVar = (x6b) this.b;
        x6bVar.t0.a.h();
        x6bVar.T0.setViewHidden(false);
    }

    @Override // o7
    public final void Q() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        tq9.d(new tf8(profileActivity, (byte) 3));
    }

    @Override // eob
    public final void Q0(boolean z) {
        am9 am9Var;
        t7b t7bVar = ((i7b) ((zi8) this.b)).D0;
        x6b x6bVar = t7bVar.w1;
        if (x6bVar != null) {
            am9 am9Var2 = null;
            if (!z) {
                if (x6bVar.getSelectedEntity() instanceof am9) {
                    t7bVar.w1.D0(null, true);
                    return;
                }
                return;
            }
            if (x6bVar.getSelectedEntity() instanceof am9) {
                return;
            }
            st7 st7Var = t7bVar.w1.H0;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= st7Var.getChildCount()) {
                    am9Var = null;
                    break;
                }
                View childAt = st7Var.getChildAt(i2);
                if (childAt instanceof am9) {
                    am9Var = (am9) childAt;
                    break;
                }
                i2++;
            }
            if (am9Var != null) {
                x6b x6bVar2 = t7bVar.w1;
                st7 st7Var2 = x6bVar2.H0;
                while (true) {
                    if (i >= st7Var2.getChildCount()) {
                        break;
                    }
                    View childAt2 = st7Var2.getChildAt(i);
                    if (childAt2 instanceof am9) {
                        am9Var2 = (am9) childAt2;
                        break;
                    }
                    i++;
                }
                x6bVar2.D0(am9Var2, true);
            }
        }
    }

    public final String R(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // u30
    public final void S() {
        c64 c64Var = ((fk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a.j0 = true;
        }
    }

    @Override // b79
    public final void T() {
        x6b x6bVar = (x6b) this.b;
        if (x6bVar.z0 != null) {
            x6bVar.D0(null, true);
        }
        x6bVar.T0.setViewHidden(true);
    }

    public final void V(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.M0(true, false);
        pVar.I0(false);
        if ((exc instanceof e1) || (exc instanceof f1)) {
            ij.t0(k96.M0(2131747211, null), pVar);
        } else {
            ij.t0(exc.getMessage(), pVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i) {
        TLRPC.TL_exportedNoPaidMessagesToken c;
        kw8 kw8Var = ((gw8) this.b).e;
        if (kw8Var == null || kw8Var.d == i) {
            return;
        }
        byte b = i;
        b = i;
        if (kw8Var.c.d && i == 2) {
            b = 1;
        }
        kw8Var.d = b;
        kw8Var.f().edit().putBoolean("qrNoPaidPermanent", kw8Var.d == 2).apply();
        byte b2 = kw8Var.d;
        if (b2 == 0) {
            if (kw8Var.n != 0) {
                ConnectionsManager.getInstance(kw8Var.a).cancelRequest(kw8Var.n, true);
                kw8Var.n = 0;
                return;
            }
            return;
        }
        if (b2 == 2 && (c = kw8Var.c()) != null) {
            kw8Var.f = c;
            kw8Var.b.setFreeLink(kw8Var.d(c));
        }
        kw8Var.n(false, kw8Var.d == 1);
    }

    @Override // eob
    public final void W0(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null || (arrayList = f4bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((f4b) zi8Var.d.T.get(i)).V = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        ps4 ps4Var;
        boolean z2;
        os4 os4Var = (os4) this.b;
        int i = os4.w;
        ps4 ps4Var2 = os4Var.f;
        c1 c1Var = os4Var.e;
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = os4Var.v;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            os4Var.v = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i2 = action & kk7.d4;
        boolean z3 = i2 == 6;
        int actionIndex = z3 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                f = motionEvent.getX(i3) + f;
                f2 = motionEvent.getY(i3) + f2;
            }
        }
        float f3 = z3 ? pointerCount - 1 : pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i2 == 0) {
            if (os4Var.g != null && ps4Var2.a()) {
                boolean hasMessages = c1Var.hasMessages(3);
                if (hasMessages) {
                    c1Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = os4Var.m;
                if (motionEvent4 != null && (motionEvent3 = os4Var.n) != null && hasMessages && os4Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y * y) + (x * x) < os4Var.b) {
                        os4Var.o = true;
                        z = os4Var.g.onDoubleTap(os4Var.m) | os4Var.g.onDoubleTapEvent(motionEvent);
                        os4Var.p = f4;
                        os4Var.r = f4;
                        os4Var.q = f5;
                        os4Var.s = f5;
                        motionEvent2 = os4Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        os4Var.m = MotionEvent.obtain(motionEvent);
                        os4Var.k = true;
                        os4Var.l = true;
                        os4Var.h = true;
                        os4Var.j = false;
                        os4Var.i = false;
                        if (os4Var.t) {
                            c1Var.removeMessages(2);
                            c1Var.sendEmptyMessageAtTime(2, os4Var.m.getDownTime() + i + os4Var.u);
                        }
                        c1Var.sendEmptyMessageAtTime(1, os4Var.m.getDownTime() + i);
                        return z | ps4Var2.onDown(motionEvent);
                    }
                }
                c1Var.sendEmptyMessageDelayed(3, 220L);
            }
            z = false;
            os4Var.p = f4;
            os4Var.r = f4;
            os4Var.q = f5;
            os4Var.s = f5;
            motionEvent2 = os4Var.m;
            if (motionEvent2 != null) {
            }
            os4Var.m = MotionEvent.obtain(motionEvent);
            os4Var.k = true;
            os4Var.l = true;
            os4Var.h = true;
            os4Var.j = false;
            os4Var.i = false;
            if (os4Var.t) {
            }
            c1Var.sendEmptyMessageAtTime(1, os4Var.m.getDownTime() + i);
            return z | ps4Var2.onDown(motionEvent);
        }
        if (i2 == 1) {
            os4Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (os4Var.o) {
                onFling = os4Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (os4Var.j) {
                    c1Var.removeMessages(3);
                    os4Var.j = false;
                } else if (os4Var.k) {
                    boolean onSingleTapUp = ps4Var2.onSingleTapUp(motionEvent);
                    if (os4Var.i && (ps4Var = os4Var.g) != null) {
                        ps4Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker2 = os4Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker2.computeCurrentVelocity(1000, os4Var.d);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > os4Var.c || Math.abs(xVelocity) > os4Var.c) {
                        onFling = ps4Var2.onFling(os4Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = os4Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            os4Var.n = obtain;
            VelocityTracker velocityTracker3 = os4Var.v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                os4Var.v = null;
            }
            os4Var.o = false;
            os4Var.i = false;
            c1Var.removeMessages(1);
            c1Var.removeMessages(2);
            return onFling;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                c1Var.removeMessages(1);
                c1Var.removeMessages(2);
                c1Var.removeMessages(3);
                os4Var.v.recycle();
                os4Var.v = null;
                os4Var.o = false;
                os4Var.h = false;
                os4Var.k = false;
                os4Var.l = false;
                os4Var.i = false;
                if (os4Var.j) {
                    os4Var.j = false;
                    return false;
                }
            } else if (i2 == 5) {
                os4Var.p = f4;
                os4Var.r = f4;
                os4Var.q = f5;
                os4Var.s = f5;
                c1Var.removeMessages(1);
                c1Var.removeMessages(2);
                c1Var.removeMessages(3);
                os4Var.o = false;
                os4Var.k = false;
                os4Var.l = false;
                os4Var.i = false;
                if (os4Var.j) {
                    os4Var.j = false;
                    return false;
                }
            } else if (i2 == 6) {
                os4Var.p = f4;
                os4Var.r = f4;
                os4Var.q = f5;
                os4Var.s = f5;
                os4Var.v.computeCurrentVelocity(1000, os4Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = os4Var.v.getXVelocity(pointerId2);
                float yVelocity2 = os4Var.v.getYVelocity(pointerId2);
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    if (i4 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i4);
                        if ((os4Var.v.getYVelocity(pointerId3) * yVelocity2) + (os4Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            os4Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!os4Var.j) {
            float f6 = os4Var.p - f4;
            float f7 = os4Var.q - f5;
            if (os4Var.o) {
                return os4Var.g.onDoubleTapEvent(motionEvent);
            }
            if (os4Var.k) {
                int i5 = (int) (f4 - os4Var.r);
                int i6 = (int) (f5 - os4Var.s);
                int i7 = (i6 * i6) + (i5 * i5);
                if (i7 > os4Var.a) {
                    z2 = ps4Var2.onScroll(os4Var.m, motionEvent, f6, f7);
                    os4Var.p = f4;
                    os4Var.q = f5;
                    os4Var.k = false;
                    c1Var.removeMessages(3);
                    c1Var.removeMessages(1);
                    c1Var.removeMessages(2);
                } else {
                    z2 = false;
                }
                if (i7 > os4Var.a) {
                    os4Var.l = false;
                }
                return z2;
            }
            if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                boolean onScroll = ps4Var2.onScroll(os4Var.m, motionEvent, f6, f7);
                os4Var.p = f4;
                os4Var.q = f5;
                return onScroll;
            }
        }
        return false;
    }

    public final Bundle Y() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final byte Z() {
        int read = ((a51) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // eob
    public final void Z0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.F = f;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    @Override // ir9
    public final void a(int i, boolean z) {
        b68 b68Var = (b68) this.b;
        a68[] a68VarArr = b68Var.n;
        if (a68VarArr[0].b == i) {
            return;
        }
        b68Var.e = i == b68Var.h.getFirstTabId();
        a68 a68Var = a68VarArr[1];
        a68Var.b = i;
        a68Var.setVisibility(0);
        b68Var.n0(true);
        b68Var.w = z;
        r7 r7Var = b68Var.c;
        if (i == 0) {
            r7Var.setSearchFieldHint(k96.M0(2131745569, null));
        } else {
            r7Var.setSearchFieldHint(k96.M0(2131745572, null));
        }
    }

    public final int a0() {
        return ((Z() & 255) << 24) | ((Z() & 255) << 16) | ((Z() & 255) << 8) | (Z() & 255);
    }

    @Override // vd4
    public final ByteBuffer b() {
        lm6 lm6Var = (lm6) this.b;
        lm6Var.p.c();
        return (ByteBuffer) lm6Var.p.f;
    }

    @Override // eob
    public final void b0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.s0 = f;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override // s58
    public final boolean c() {
        return true;
    }

    public final int c0() {
        return ((Z() & Byte.MAX_VALUE) << 21) | ((Z() & Byte.MAX_VALUE) << 14) | ((Z() & Byte.MAX_VALUE) << 7) | (Z() & Byte.MAX_VALUE);
    }

    @Override // ml4
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // u30
    public final void d(int i) {
        bg6 bg6Var;
        fk6 fk6Var = (fk6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (bg6Var = fk6Var.d1) != null) {
            bg6Var.d(i);
        }
        tg2 tg2Var = fk6Var.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new eg((Object) tg2Var, i, (byte) 4));
        }
    }

    public final void d0(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((a51) this.b).skip(j - j2);
            if (skip <= 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }

    @Override // y60
    public final void dismiss() {
        ((wa5) this.b).x.d(true);
    }

    @Override // s58
    public final void e() {
        g48 g48Var = (g48) this.b;
        int size = g48Var.b.size();
        sb sbVar = g48Var.R;
        if (size != 0) {
            sbVar.invalidate();
            g48Var.a0(true);
        } else {
            sbVar.setPivotX(0.0f);
            g48Var.R.setPivotY(0.0f);
            g48Var.a0(false);
        }
    }

    @Override // eob
    public final void e1(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.E = f;
        f4bVar.j = true;
        zi8Var.w(true);
    }

    @Override // eob
    public final void f(int i) {
        qk2 qk2Var = ((zi8) this.b).F;
        if (qk2Var != null) {
            ArrayList arrayList = qk2Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                pk2 pk2Var = (pk2) obj;
                if (pk2Var.a == i) {
                    pk2Var.b.e(true, 1.0f);
                    qk2Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // u30
    public final void f1() {
        ((fk6) this.b).u();
    }

    @Override // ir9
    public final void g(float f) {
        b68 b68Var = (b68) this.b;
        a68[] a68VarArr = b68Var.n;
        if (f != 1.0f || a68VarArr[1].getVisibility() == 0) {
            if (b68Var.w) {
                a68VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                a68VarArr[1].setTranslationX(a68VarArr[0].getMeasuredWidth() - (f * a68VarArr[0].getMeasuredWidth()));
            } else {
                a68VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                a68VarArr[1].setTranslationX((f * a68VarArr[0].getMeasuredWidth()) - a68VarArr[0].getMeasuredWidth());
            }
            if (f == 1.0f) {
                a68 a68Var = a68VarArr[0];
                a68VarArr[0] = a68VarArr[1];
                a68VarArr[1] = a68Var;
                a68Var.setVisibility(8);
            }
        }
    }

    @Override // yt7
    public final float get() {
        dj6 dj6Var = (dj6) this.b;
        m01 currentBrush = dj6Var.e.getCurrentBrush();
        int i = dj6Var.a;
        return currentBrush == null ? k38.e(i).i : k38.e(i).f("-1", currentBrush.c());
    }

    @Override // vd4
    public final float getBlurAngle() {
        return ((lm6) this.b).t;
    }

    @Override // vd4
    public final float getBlurExcludeBlurSize() {
        return ((lm6) this.b).s;
    }

    @Override // vd4
    public final PointF getBlurExcludePoint() {
        return ((lm6) this.b).r;
    }

    @Override // vd4
    public final float getBlurExcludeSize() {
        return ((lm6) this.b).q;
    }

    @Override // vd4
    public final int getBlurType() {
        return ((lm6) this.b).n;
    }

    @Override // vd4
    public final float getContrastValue() {
        return b00.A(((lm6) this.b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override // vd4
    public final float getEnhanceValue() {
        return ((lm6) this.b).a / 100.0f;
    }

    @Override // vd4
    public final float getExposureValue() {
        return ((lm6) this.b).c / 100.0f;
    }

    @Override // vd4
    public final float getFadeValue() {
        return ((lm6) this.b).g / 100.0f;
    }

    @Override // vd4
    public final float getGrainValue() {
        return (((lm6) this.b).m / 100.0f) * 0.04f;
    }

    @Override // vd4
    public final float getHighlightsValue() {
        return b00.y(((lm6) this.b).j, 0.75f, 100.0f, 100.0f);
    }

    @Override // vd4
    public final float getSaturationValue() {
        float f = ((lm6) this.b).f / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    @Override // vd4
    public final float getShadowsValue() {
        return b00.y(((lm6) this.b).k, 0.55f, 100.0f, 100.0f);
    }

    @Override // vd4
    public final float getSharpenValue() {
        return b00.A(((lm6) this.b).o, 100.0f, 0.6f, 0.11f);
    }

    @Override // vd4
    public final float getSoftenSkinValue() {
        return ((lm6) this.b).b / 100.0f;
    }

    @Override // vd4
    public final int getTintHighlightsColor() {
        return ((lm6) this.b).i;
    }

    @Override // vd4
    public final float getTintHighlightsIntensityValue() {
        return ((lm6) this.b).i == 0 ? 0.0f : 0.5f;
    }

    @Override // vd4
    public final int getTintShadowsColor() {
        return ((lm6) this.b).h;
    }

    @Override // vd4
    public final float getTintShadowsIntensityValue() {
        return ((lm6) this.b).h == 0 ? 0.0f : 0.5f;
    }

    @Override // vd4
    public final float getVignetteValue() {
        return ((lm6) this.b).l / 100.0f;
    }

    @Override // vd4
    public final float getWarmthValue() {
        return ((lm6) this.b).e / 100.0f;
    }

    @Override // u30
    public final void h(boolean z) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new x6c((byte) 3, tg2Var, z));
        }
    }

    @Override // r9
    public final void i(Object obj) {
        q9 q9Var = (q9) obj;
        go4 go4Var = (go4) this.b;
        co4 co4Var = (co4) go4Var.F.pollLast();
        if (co4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = co4Var.a;
        int i = co4Var.b;
        bn4 n = go4Var.c.n(str);
        if (n != null) {
            n.x(i, q9Var.a, q9Var.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // s58
    public final void j(Editable editable) {
        g48 g48Var = (g48) this.b;
        rt3 rt3Var = g48Var.N;
        g48Var.a = editable;
        rt3Var.setText(editable);
    }

    @Override // eob
    public final void j1(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null || (arrayList = f4bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((f4b) zi8Var.d.T.get(i)).W = f;
    }

    @Override // eob
    public final void k0(boolean z) {
        zi8 zi8Var = (zi8) this.b;
        if (zi8Var.i()) {
            zi8Var.F.getClass();
        }
        zi8Var.x(-4, z);
    }

    @Override // eob
    public final void k1(float f) {
        f4b f4bVar = ((zi8) this.b).d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.a0 = f;
        f4bVar.j = true;
    }

    @Override // s58
    public final void l(int i, boolean z, boolean z2) {
        g48 g48Var = (g48) this.b;
        g48Var.removeSelfFromStack();
        if (z) {
            return;
        }
        g48Var.Z(g48Var.b, g48Var.c, z2, i);
    }

    @Override // vd4
    public final boolean m() {
        return false;
    }

    @Override // y60
    public final void n(int i, int i2) {
        wa5 wa5Var = (wa5) this.b;
        wa5Var.X = i;
        gl.V3(wa5Var.b);
    }

    @Override // u30
    public final void o(long j) {
        fk6 fk6Var = (fk6) this.b;
        fk6Var.o1 = true;
        tg2 tg2Var = fk6Var.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new et((Object) tg2Var, j, (byte) 2));
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((x46) this.b).h(f);
    }

    @Override // eob
    public final void p0(float f, int i) {
        ArrayList arrayList;
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null || (arrayList = f4bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((f4b) zi8Var.d.T.get(i)).P = f;
    }

    @Override // eob
    public final void p1() {
        ((zi8) this.b).p(null);
    }

    @Override // u30
    public final void p2() {
        c64 c64Var = ((fk6) this.b).Y;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // ir9
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override // b79
    public final void r() {
        sb sbVar = ((x6b) this.b).F0;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    @Override // b79
    public final void s() {
        x6b x6bVar = (x6b) this.b;
        if (x6bVar.S0) {
            x6bVar.S0 = false;
        } else {
            x6bVar.a1.b(1);
            x6bVar.s((m01) m01.a.get(0));
        }
    }

    @Override // vd4
    public final boolean t() {
        return !((lm6) this.b).p.o();
    }

    @Override // u30
    public final void t0(pd5 pd5Var) {
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 1));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 10:
                a9b a9bVar = a9b.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ha) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 18:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // eob
    public final void u(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.u0 = f;
        f4bVar.j = true;
        zi8Var.b();
    }

    @Override // eob
    public final void u0(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.P = f;
        zi8Var.b();
    }

    @Override // eob
    public final void u1(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.t0 = f;
        f4bVar.j = true;
        zi8Var.y(true);
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
        op8 op8Var = ((rp8) this.b).h.H0;
        if (op8Var != null) {
            op8Var.d();
        }
    }

    @Override // eob
    public final void w(float f) {
        zi8 zi8Var = (zi8) this.b;
        f4b f4bVar = zi8Var.d;
        if (f4bVar == null) {
            return;
        }
        f4bVar.G = f;
        f4bVar.j = true;
        zi8Var.b();
    }

    @Override // u30
    public final void w1(Exception exc) {
        lad.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        tg2 tg2Var = ((fk6) this.b).b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 1));
        }
    }

    @Override // b79
    public final boolean x() {
        x6b x6bVar = (x6b) this.b;
        boolean z = x6bVar.z0 == null;
        if (!z) {
            x6bVar.D0(null, true);
        }
        return z;
    }

    public final boolean y(String str) {
        String R = R(str);
        return "1".equals(R) || Boolean.parseBoolean(R);
    }

    @Override // eob
    public final void z(long j, boolean z) {
        zi8 zi8Var = (zi8) this.b;
        if (!z) {
            zi8Var.m(j);
            return;
        }
        lbc lbcVar = zi8Var.e;
        if (lbcVar != null) {
            lbcVar.p0(j, true);
            return;
        }
        if (zi8Var.i()) {
            zi8Var.F.m(j, true);
            return;
        }
        lbc lbcVar2 = zi8Var.E;
        if (lbcVar2 != null) {
            lbcVar2.p0(j, false);
        }
    }

    @Override // o7
    public final void A() {
    }

    @Override // ir9
    public final void B() {
    }

    @Override // y60
    public final void N() {
    }

    @Override // s58
    public final void k() {
    }

    @Override // b79
    public final void q() {
    }

    public /* synthetic */ z24(ln8 ln8Var) {
        this.a = (byte) 29;
        this.b = (efd) ln8Var.b;
    }

    public /* synthetic */ z24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ z24(byte b, boolean z) {
        this.a = b;
    }

    public z24(Bundle bundle) {
        this.a = (byte) 20;
        this.b = new Bundle(bundle);
    }

    public z24(Context context, Uri uri) {
        this.a = (byte) 3;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // lt8
    public final Object get() {
        return new w86((Context) ((mo5) this.b).a);
    }

    public z24(Context context, ps4 ps4Var) {
        this.a = (byte) 5;
        this.b = new os4(context, ps4Var);
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
