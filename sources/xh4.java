// default package

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xh4 implements cr7, rn4, s9, yj5, a70, s84, fx7, v30, ag4, l12, i89, bl0, hcb, ugc {
    public final /* synthetic */ byte a;
    public Object b;

    public xh4(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.b = po5.p();
                break;
        }
    }

    @Override // ugc
    public final int A() {
        q79 q79Var = (q79) this.b;
        return q79Var.m - q79Var.D();
    }

    @Override // ugc
    public final View B(int i) {
        return ((q79) this.b).q(i);
    }

    @Override // bl0
    public final float B0() {
        return -1.0f;
    }

    @Override // ugc
    public final int C(View view) {
        return q79.x(view) + ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).rightMargin;
    }

    @Override // v30
    public final void C0(long j, int i, long j2) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new m30((Object) lh2Var, i, j, j2, (byte) 0));
        }
    }

    @Override // v30
    public final void D() {
        w64 w64Var = ((km6) this.b).Y;
        if (w64Var != null) {
            w64Var.a.j0 = true;
        }
    }

    @Override // bl0
    public final float D0() {
        return -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        tu4 tu4Var;
        boolean z2;
        su4 su4Var = (su4) this.b;
        int i = su4.w;
        tu4 tu4Var2 = su4Var.f;
        d1 d1Var = su4Var.e;
        int action = motionEvent.getAction();
        VelocityTracker velocityTracker = su4Var.v;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            su4Var.v = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i2 = action & jn7.d4;
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
            if (su4Var.g != null && tu4Var2.a()) {
                boolean hasMessages = d1Var.hasMessages(3);
                if (hasMessages) {
                    d1Var.removeMessages(3);
                }
                MotionEvent motionEvent4 = su4Var.m;
                if (motionEvent4 != null && (motionEvent3 = su4Var.n) != null && hasMessages && su4Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y * y) + (x * x) < su4Var.b) {
                        su4Var.o = true;
                        z = su4Var.g.onDoubleTap(su4Var.m) | su4Var.g.onDoubleTapEvent(motionEvent);
                        su4Var.p = f4;
                        su4Var.r = f4;
                        su4Var.q = f5;
                        su4Var.s = f5;
                        motionEvent2 = su4Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        su4Var.m = MotionEvent.obtain(motionEvent);
                        su4Var.k = true;
                        su4Var.l = true;
                        su4Var.h = true;
                        su4Var.j = false;
                        su4Var.i = false;
                        if (su4Var.t) {
                            d1Var.removeMessages(2);
                            d1Var.sendEmptyMessageAtTime(2, su4Var.m.getDownTime() + i + su4Var.u);
                        }
                        d1Var.sendEmptyMessageAtTime(1, su4Var.m.getDownTime() + i);
                        return z | tu4Var2.onDown(motionEvent);
                    }
                }
                d1Var.sendEmptyMessageDelayed(3, 220L);
            }
            z = false;
            su4Var.p = f4;
            su4Var.r = f4;
            su4Var.q = f5;
            su4Var.s = f5;
            motionEvent2 = su4Var.m;
            if (motionEvent2 != null) {
            }
            su4Var.m = MotionEvent.obtain(motionEvent);
            su4Var.k = true;
            su4Var.l = true;
            su4Var.h = true;
            su4Var.j = false;
            su4Var.i = false;
            if (su4Var.t) {
            }
            d1Var.sendEmptyMessageAtTime(1, su4Var.m.getDownTime() + i);
            return z | tu4Var2.onDown(motionEvent);
        }
        if (i2 == 1) {
            su4Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (su4Var.o) {
                onFling = su4Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (su4Var.j) {
                    d1Var.removeMessages(3);
                    su4Var.j = false;
                } else if (su4Var.k) {
                    boolean onSingleTapUp = tu4Var2.onSingleTapUp(motionEvent);
                    if (su4Var.i && (tu4Var = su4Var.g) != null) {
                        tu4Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker2 = su4Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker2.computeCurrentVelocity(1000, su4Var.d);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > su4Var.c || Math.abs(xVelocity) > su4Var.c) {
                        onFling = tu4Var2.onFling(su4Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = su4Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            su4Var.n = obtain;
            VelocityTracker velocityTracker3 = su4Var.v;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                su4Var.v = null;
            }
            su4Var.o = false;
            su4Var.i = false;
            d1Var.removeMessages(1);
            d1Var.removeMessages(2);
            return onFling;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                d1Var.removeMessages(1);
                d1Var.removeMessages(2);
                d1Var.removeMessages(3);
                su4Var.v.recycle();
                su4Var.v = null;
                su4Var.o = false;
                su4Var.h = false;
                su4Var.k = false;
                su4Var.l = false;
                su4Var.i = false;
                if (su4Var.j) {
                    su4Var.j = false;
                    return false;
                }
            } else if (i2 == 5) {
                su4Var.p = f4;
                su4Var.r = f4;
                su4Var.q = f5;
                su4Var.s = f5;
                d1Var.removeMessages(1);
                d1Var.removeMessages(2);
                d1Var.removeMessages(3);
                su4Var.o = false;
                su4Var.k = false;
                su4Var.l = false;
                su4Var.i = false;
                if (su4Var.j) {
                    su4Var.j = false;
                    return false;
                }
            } else if (i2 == 6) {
                su4Var.p = f4;
                su4Var.r = f4;
                su4Var.q = f5;
                su4Var.s = f5;
                su4Var.v.computeCurrentVelocity(1000, su4Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = su4Var.v.getXVelocity(pointerId2);
                float yVelocity2 = su4Var.v.getYVelocity(pointerId2);
                for (int i4 = 0; i4 < pointerCount; i4++) {
                    if (i4 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i4);
                        if ((su4Var.v.getYVelocity(pointerId3) * yVelocity2) + (su4Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            su4Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!su4Var.j) {
            float f6 = su4Var.p - f4;
            float f7 = su4Var.q - f5;
            if (su4Var.o) {
                return su4Var.g.onDoubleTapEvent(motionEvent);
            }
            if (su4Var.k) {
                int i5 = (int) (f4 - su4Var.r);
                int i6 = (int) (f5 - su4Var.s);
                int i7 = (i6 * i6) + (i5 * i5);
                if (i7 > su4Var.a) {
                    z2 = tu4Var2.onScroll(su4Var.m, motionEvent, f6, f7);
                    su4Var.p = f4;
                    su4Var.q = f5;
                    su4Var.k = false;
                    d1Var.removeMessages(3);
                    d1Var.removeMessages(1);
                    d1Var.removeMessages(2);
                } else {
                    z2 = false;
                }
                if (i7 > su4Var.a) {
                    su4Var.l = false;
                }
                return z2;
            }
            if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                boolean onScroll = tu4Var2.onScroll(su4Var.m, motionEvent, f6, f7);
                su4Var.p = f4;
                su4Var.q = f5;
                return onScroll;
            }
        }
        return false;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // rn4
    public final Cursor F(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // fx7
    public final void G(float f) {
        switch (this.a) {
            case 12:
                gc8 gc8Var = (gc8) this.b;
                a78.e(gc8Var.a).k("-1", f);
                gc8Var.e.setBrushSize(f);
                break;
            default:
                wab wabVar = (wab) this.b;
                a78.e(wabVar.p1).k(String.valueOf(v01.a.indexOf(wabVar.y0.getCurrentBrush())), f);
                igb igbVar = wabVar.k1;
                igbVar.c = f;
                wabVar.D0(igbVar, null, false);
                break;
        }
    }

    @Override // a70
    public final void H(int i, int i2) {
        xc5 xc5Var = (xc5) this.b;
        xc5Var.X = i;
        hl.V3(xc5Var.b);
    }

    public final void I(f89 f89Var, m09 m09Var, m09 m09Var2) {
        int i;
        int i2;
        boolean z;
        f89 U;
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.l(f89Var);
        recyclerView.h(f89Var);
        f89Var.q(false);
        cma cmaVar = (cma) recyclerView.d0;
        cmaVar.getClass();
        int i4 = m09Var.b;
        int i5 = m09Var.c;
        View view = f89Var.a;
        if (m09Var2 == null) {
            i2 = view.getLeft();
            i = view.getTop();
        } else {
            int i6 = m09Var2.b;
            i = m09Var2.c;
            i2 = i6;
        }
        if (f89Var.j() || (i4 == i2 && i5 == i)) {
            int i7 = f89Var.h;
            int i8 = -1;
            if (i7 != -1) {
                for (int i9 = 0; i9 < recyclerView.getChildCount(); i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i3 = U.h) >= 0 && i3 < i7 && i3 > i8) {
                        i8 = i3;
                    }
                }
            }
            f89Var.i = (f89Var.h - i8) + (i8 * 1000);
            cmaVar.s(f89Var, m09Var);
            z = true;
        } else {
            view.layout(i2, i, view.getWidth() + i2, view.getHeight() + i);
            z = cmaVar.r(f89Var, m09Var, i4, i5, i2, i);
        }
        if (z) {
            recyclerView.o0();
        }
    }

    public final byte J() {
        int read = ((i51) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final int K() {
        return ((J() & 255) << 24) | ((J() & 255) << 16) | ((J() & 255) << 8) | (J() & 255);
    }

    public final int L() {
        return ((J() & Byte.MAX_VALUE) << 21) | ((J() & Byte.MAX_VALUE) << 14) | ((J() & Byte.MAX_VALUE) << 7) | (J() & Byte.MAX_VALUE);
    }

    @Override // v30
    public final void M(qf5 qf5Var) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 1));
        }
    }

    public final void O(long j) {
        long j2 = 0;
        while (j2 < j) {
            long skip = ((i51) this.b).skip(j - j2);
            if (skip <= 0) {
                throw new EOFException();
            }
            j2 += skip;
        }
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    public final void P(f89 f89Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        q79 q79Var = recyclerView.y;
        View view = f89Var.a;
        oh2 oh2Var = recyclerView.b;
        rx6 rx6Var = q79Var.a;
        j09 j09Var = (j09) rx6Var.b;
        int indexOfChild = ((RecyclerView) j09Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((zg2) rx6Var.c).y(indexOfChild)) {
                rx6Var.A0(view);
            }
            j09Var.N(indexOfChild);
        }
        oh2Var.h(view);
    }

    @Override // bl0
    public final int Q1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return aob.p1(profileActivity.f2(), ol0Var.a(ol0Var.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (r2 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 == 3) goto L18;
     */
    @Override // cr7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(Object obj) {
        Integer num = (Integer) obj;
        ai4 ai4Var = (ai4) this.b;
        Handler handler = ai4Var.B0;
        zz3 zz3Var = ai4Var.C0;
        handler.removeCallbacks(zz3Var);
        int intValue = num.intValue();
        if (ai4Var.G0 != null) {
            int i = ai4Var.D0.w;
            Context n = ai4Var.n();
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
                ai4Var.G0.setImageDrawable(drawable);
                if ((i != 0 || intValue != 1) && ((i == 1 && intValue == 2) || (i == 2 && intValue == 1))) {
                    yh4.a(drawable);
                }
                ai4Var.D0.w = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = ai4Var.H0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? ai4Var.E0 : ai4Var.F0);
        }
        handler.postDelayed(zz3Var, 2000L);
    }

    @Override // l12
    public final void V() {
        hl.t1(((b18) this.b).fragmentView.findFocus());
    }

    @Override // bl0
    public final int X() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return vm2.f(profileActivity.f2(), 553648127, ol0Var.a(ol0Var.c));
    }

    @Override // v30
    public final void Z() {
        ((km6) this.b).u();
    }

    @Override // ag4
    public final boolean b() {
        return !((lm7) this.b).M;
    }

    @Override // ugc
    public final int c(View view) {
        return q79.w(view) - ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).leftMargin;
    }

    @Override // rn4
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // v30
    public final void d(int i) {
        fi6 fi6Var;
        km6 km6Var = (km6) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (fi6Var = km6Var.d1) != null) {
            fi6Var.d(i);
        }
        lh2 lh2Var = km6Var.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new zd((Object) lh2Var, i, (byte) 4));
        }
    }

    @Override // a70
    public final void dismiss() {
        ((xc5) this.b).x.d(true);
    }

    @Override // ag4
    public final void e() {
        ((lm7) this.b).v();
    }

    @Override // ag4
    public final boolean g(dg4 dg4Var) {
        return false;
    }

    @Override // fx7
    public final float get() {
        switch (this.a) {
            case 12:
                gc8 gc8Var = (gc8) this.b;
                v01 currentBrush = gc8Var.e.getCurrentBrush();
                int i = gc8Var.a;
                return currentBrush == null ? a78.e(i).i : a78.e(i).f("-1", currentBrush.c());
            default:
                wab wabVar = (wab) this.b;
                v01 currentBrush2 = wabVar.y0.getCurrentBrush();
                int i2 = wabVar.p1;
                return currentBrush2 == null ? a78.e(i2).i : a78.e(i2).f(String.valueOf(v01.a.indexOf(currentBrush2)), currentBrush2.c());
        }
    }

    @Override // v30
    public final void h(boolean z) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new xac((byte) 3, lh2Var, z));
        }
    }

    @Override // v30
    public final void h0(Exception exc) {
        efd.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 1));
        }
    }

    @Override // ag4
    public final boolean i() {
        return false;
    }

    @Override // hcb
    public final boolean j(long j, int i, int i2, int i3, icb icbVar) {
        ImageReceiver imageReceiver;
        iv8 iv8Var;
        iv8 iv8Var2;
        icbVar.b = null;
        icbVar.c = null;
        lq8 lq8Var = (lq8) this.b;
        iq8 iq8Var = lq8Var.h;
        ArrayList arrayList = lq8Var.x;
        if (lq8Var.O < 0.2f) {
            icbVar.b = iq8Var.getImageReceiver();
            icbVar.c = null;
            icbVar.a = iq8Var;
            icbVar.h = 0.0f;
            icbVar.i = hl.q.y;
            icbVar.g = (View) lq8Var.getParent();
            icbVar.d = lq8Var.E;
            icbVar.n = true;
            return true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                imageReceiver = null;
                iv8Var = null;
                iv8Var2 = null;
                break;
            }
            iv8 iv8Var3 = (iv8) arrayList.get(i4);
            if (iv8Var3.e < 1.0f || iv8Var3.a != i2) {
                i4++;
            } else {
                int i5 = i4 - 1;
                int i6 = i4 - 2;
                iv8 d = ProfileStoriesView.d(i5 >= 0 ? (iv8) arrayList.get(i5) : null, i6 >= 0 ? (iv8) arrayList.get(i6) : null, iv8Var3);
                imageReceiver = iv8Var3.b;
                iv8Var2 = d;
                iv8Var = iv8Var3;
            }
        }
        if (imageReceiver == null) {
            return false;
        }
        icbVar.c = imageReceiver;
        icbVar.b = null;
        icbVar.a = lq8Var;
        icbVar.h = 0.0f;
        icbVar.i = hl.q.y;
        icbVar.g = (View) lq8Var.getParent();
        if (iv8Var == null || iv8Var2 == null) {
            icbVar.f = null;
            return true;
        }
        icbVar.f = new xg(this, new RectF(iv8Var.m), iv8Var, new RectF(iv8Var2.m), iv8Var2);
        return true;
    }

    @Override // s9
    public final void k(Object obj) {
        r9 r9Var = (r9) obj;
        kq4 kq4Var = (kq4) this.b;
        gq4 gq4Var = (gq4) kq4Var.F.pollLast();
        if (gq4Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = gq4Var.a;
        int i = gq4Var.b;
        gp4 p = kq4Var.c.p(str);
        if (p != null) {
            p.x(i, r9Var.a, r9Var.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // v30
    public final void l0() {
        ((km6) this.b).l1 = true;
    }

    @Override // ugc
    public final int m() {
        return ((q79) this.b).C();
    }

    @Override // bl0
    public final int m0() {
        return 0;
    }

    @Override // bl0
    public final float m1() {
        return 0.0f;
    }

    @Override // v30
    public final void n(long j) {
        km6 km6Var = (km6) this.b;
        km6Var.o1 = true;
        lh2 lh2Var = km6Var.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new kt((Object) lh2Var, j, (byte) 2));
        }
    }

    @Override // i89
    public final void n0(View view, boolean z) {
        if (z == ((l98) this.b).Y && (view instanceof d88)) {
            d88 d88Var = (d88) view;
            d88Var.y.c(d88Var);
        }
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // bl0
    public final int o1() {
        return 0;
    }

    @Override // ag4
    public final int q(int i) {
        return 0;
    }

    @Override // i89
    public final void r(boolean z) {
        wk5 wk5Var;
        l98 l98Var = (l98) this.b;
        l98Var.X = z ? (byte) 1 : (byte) 0;
        if (z) {
            wk5Var = ((e) l98Var).parentLayout;
            wk5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        l98Var.L.f1(true);
    }

    @Override // ag4
    public final void s(bg4 bg4Var, boolean z) {
        ir1 ir1Var = ((lm7) this.b).w;
        if (ir1Var != null) {
            ir1Var.F(bg4Var.a);
        }
    }

    @Override // i89
    public final boolean s0(int i) {
        l98 l98Var = (l98) this.b;
        do6 do6Var = l98Var.K;
        return l98Var.b.containsKey(do6Var != null ? Integer.valueOf(((no6) do6Var.e.get(i)).C) : ((ro6) l98Var.f.get(i)).B);
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        ((b76) this.b).h(f);
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                ycb ycbVar = ycb.e;
                StringBuffer stringBuffer = new StringBuffer("execution(");
                stringBuffer.append(((ia) this.b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // v30
    public final void u(qf5 qf5Var) {
        lh2 lh2Var = ((km6) this.b).b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 0));
        }
    }

    public final void v() {
        na9 na9Var = ((pa9) this.b).d;
        if (na9Var != null) {
            ma9 ma9Var = na9Var.s;
            if (ma9Var != null) {
                na9Var.cancelRunnable(ma9Var);
                na9Var.s = null;
            }
            ma9 ma9Var2 = new ma9(na9Var, (byte) 2);
            na9Var.s = ma9Var2;
            na9Var.postRunnable(ma9Var2, 1L);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
        ((b76) this.b).h(f);
    }

    @Override // i89
    public final boolean w(int i) {
        return ((l98) this.b).M.d(i) == 0;
    }

    @Override // v30
    public final void w0() {
        w64 w64Var = ((km6) this.b).Y;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // hcb
    public final void x(long j, int i, y58 y58Var) {
        lq8 lq8Var = (lq8) this.b;
        int i2 = ProfileStoriesView.t0;
        lq8Var.f(true, false);
        y58Var.run();
    }

    @Override // bl0
    public final int x0() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return vm2.f(profileActivity.f2(), 352321535, ol0Var.a(ol0Var.d));
    }

    @Override // bl0
    public final int x1() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        ol0 ol0Var = profileActivity.M5;
        return aob.p1(profileActivity.f2(), ol0Var.a(ol0Var.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0355, code lost:
    
        if (r7.equals("HOME") == false) goto L167;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ViewGroup y(Activity activity, int i) {
        boolean z;
        String str;
        p78 p78Var;
        gl glVar;
        int i2;
        String str2;
        r78 r78Var = (r78) this.b;
        ArrayList arrayList = r78Var.F1;
        ArrayList arrayList2 = r78Var.G1;
        boolean z2 = i != 0;
        if (z2) {
            p78 p78Var2 = new p78(activity);
            TextView textView = new TextView(activity);
            p78Var2.a = textView;
            int i3 = aob.G6;
            int i4 = r78.I1;
            vnb vnbVar = r78Var.J0;
            boolean z3 = r78Var.D1;
            yob.X(textView, i3, vnbVar);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((ob6.a0 ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z4 = ob6.a0;
            p78Var2.addView(textView, tre.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? z3 ? 17 : 64 : 72.0f, 10.0f, z4 ? 72.0f : z3 ? 17 : 64, 0.0f));
            TextView textView2 = new TextView(activity);
            p78Var2.b = textView2;
            yob.X(textView2, aob.z6, r78Var.J0);
            ik8.w(textView2, 1, 13.0f, 1, 1);
            textView2.setSingleLine(true);
            textView2.setGravity(ob6.a0 ? 5 : 3);
            boolean z5 = ob6.a0;
            p78Var2.addView(textView2, tre.d(-2, -2.0f, z5 ? 5 : 3, z5 ? z3 ? 17 : 64 : 72.0f, 35.0f, z5 ? 72.0f : z3 ? 17 : 64, 0.0f));
            ImageView imageView = new ImageView(activity);
            p78Var2.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            yob.s(imageView, aob.m6, r78Var.J0, PorterDuff.Mode.MULTIPLY);
            boolean z6 = ob6.a0;
            p78Var2.addView(imageView, tre.d(-2, -2.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : 20.0f, 20.0f, z6 ? 20.0f : 0.0f, 0.0f));
            p78Var = p78Var2;
            if (!z3) {
                Switch r8 = new Switch(activity, null);
                p78Var2.d = r8;
                int i5 = aob.M6;
                int i6 = aob.N6;
                int i7 = aob.d6;
                r8.d(i5, i6, i7, i7);
                p78Var2.addView(r8, tre.d(37, 40.0f, (ob6.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                p78Var = p78Var2;
            }
        } else {
            ?? q78Var = new q78(activity);
            q78Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = r78Var.H1;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((gl) arrayList2.get(0)).c(true);
                z = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus == null || userStatus.expires == 0) {
                    z = true;
                    str = null;
                } else {
                    str = ob6.d0(r78Var.a, tL_userContact_old2, null, null);
                    z = true;
                }
            }
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.s(hl.L(30.0f));
            rb0Var.q(tL_userContact_old2);
            de0 de0Var = new de0(activity);
            de0Var.setRoundRadius(hl.L(40.0f));
            de0Var.f(tL_userContact_old2, rb0Var);
            q78Var.addView(de0Var, tre.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(activity);
            ik8.v(textView3, 1, 17.0f);
            yob.X(textView3, aob.j5, r78Var.J0);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(lv2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            q78Var.addView(textView3, tre.t(-2, -2, 49, 10, 10, 10, str != null ? 0 : 27));
            p78Var = q78Var;
            if (str != null) {
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                yob.X(textView4, aob.r5, r78Var.J0);
                textView4.setSingleLine(true);
                textView4.setEllipsize(truncateAt);
                textView4.setText(str);
                q78Var.addView(textView4, tre.t(-2, -2, 49, 10, 3, 10, z ? 27 : 11));
                p78Var = q78Var;
            }
        }
        if (z2) {
            p78 p78Var3 = p78Var;
            int i8 = r78Var.z1;
            char c = 2;
            if (i < i8 || i >= r78Var.A1) {
                glVar = (gl) arrayList.get(i - r78Var.B1);
                int i9 = glVar.c;
                if (i9 == 1) {
                    i2 = R.drawable.msg_mention;
                } else if (i9 == 2) {
                    i2 = R.drawable.msg_location;
                } else if (i9 == 3) {
                    i2 = R.drawable.msg_link;
                } else {
                    if (i9 != 4) {
                        if (i9 == 5) {
                            i2 = R.drawable.msg_calendar2;
                        } else if (i9 == 6) {
                            i2 = "ORG".equalsIgnoreCase(glVar.a(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                        }
                    }
                    i2 = R.drawable.msg_info;
                }
            } else {
                glVar = (gl) arrayList2.get(i - i8);
                i2 = R.drawable.msg_calls;
            }
            boolean z7 = i != r78Var.y1 - 1;
            p78Var3.a.setText(glVar.c(true));
            TextView textView5 = p78Var3.b;
            int i10 = glVar.c;
            if (i10 == 4) {
                str2 = ob6.M0(2131751752, null);
            } else if (i10 == 3) {
                str2 = ob6.M0(2131751746, null);
            } else if (i10 == 5) {
                str2 = ob6.M0(2131751768, null);
            } else if (i10 == 6) {
                str2 = "ORG".equalsIgnoreCase(glVar.a(true)) ? ob6.M0(2131751757, null) : ob6.M0(2131751756, null);
            } else {
                int indexOf = glVar.b.indexOf(58);
                if (indexOf < 0) {
                    str2 = "";
                } else {
                    String substring = glVar.b.substring(0, indexOf);
                    if (glVar.c != 20) {
                        String[] split = substring.split(";");
                        for (int i11 = 0; i11 < split.length; i11++) {
                            if (split[i11].indexOf(61) < 0) {
                                substring = split[i11];
                            }
                        }
                        if (substring.startsWith("X-")) {
                            substring = substring.substring(2);
                        }
                        switch (substring.hashCode()) {
                            case -2015525726:
                                if (substring.equals("MOBILE")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2064738:
                                if (substring.equals("CELL")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2223327:
                                break;
                            case 2464291:
                                if (substring.equals("PREF")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2670353:
                                if (substring.equals("WORK")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 75532016:
                                if (substring.equals("OTHER")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                substring = ob6.M0(2131747018, null);
                                break;
                            case 2:
                                substring = ob6.M0(2131747020, null);
                                break;
                            case 3:
                                substring = ob6.M0(2131747019, null);
                                break;
                            case 4:
                                substring = ob6.M0(2131747008, null);
                                break;
                            case 5:
                                substring = ob6.M0(2131747009, null);
                                break;
                        }
                    } else {
                        substring = substring.substring(2).split(";")[0];
                    }
                    str2 = substring.substring(0, 1).toUpperCase() + substring.substring(1).toLowerCase();
                }
            }
            textView5.setText(str2);
            Switch r2 = p78Var3.d;
            if (r2 != null) {
                r2.c(glVar.d, false);
            }
            p78Var3.c.setImageResource(i2);
            p78Var3.e = z7;
            p78Var3.setWillNotDraw(!z7);
        }
        return p78Var;
    }

    @Override // v30
    public final void z() {
        ((km6) this.b).n1 = true;
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var;
        b18 b18Var = (b18) this.b;
        if (b18Var.getParentActivity() == null || (n12Var = b18Var.S0) == null) {
            return;
        }
        if (i != 8) {
            if (i != 7) {
                n12Var.I(i);
                b18Var.I1(i);
                return;
            }
            n12Var.a(true);
        }
        HashMap<Object, Object> selectedPhotos = b18Var.S0.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = b18Var.S0.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < selectedPhotosOrder.size(); i4++) {
            no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i4));
            q7a q7aVar = new q7a();
            String str = no6Var.h;
            if (str != null) {
                q7aVar.c = str;
            } else {
                q7aVar.c = no6Var.I;
            }
            arrayList.add(q7aVar);
            no6Var.e();
        }
        b18Var.J1(arrayList);
    }

    @Override // a70
    public final void N() {
    }

    @Override // l12
    public final void R() {
    }

    @Override // ag4
    public final void a(float f) {
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // hcb
    public final void f(boolean z) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // ag4
    public final void l(int i) {
    }

    public /* synthetic */ xh4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ xh4(byte b, boolean z) {
        this.a = b;
    }

    public xh4(Context context, Uri uri) {
        this.a = (byte) 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public xh4(Context context, tu4 tu4Var) {
        this.a = (byte) 3;
        this.b = new su4(context, tu4Var);
    }

    @Override // ag4
    public final void p(int i, int i2) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
