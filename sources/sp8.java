// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class sp8 extends lh2 implements gk7 {
    public final a A0;
    public boolean B0;
    public boolean C0;
    public final o39 D0;
    public final rp8 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final op8 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public gl5 L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public gl5 Q0;
    public gl5 R0;
    public i9c S0;
    public w97 T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList a1;
    public final ArrayList b1;
    public final ArrayList c1;
    public int d1;
    public final SparseArray e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public ma8 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public kp8 q1;
    public gl5 r1;
    public gl5 s1;
    public final PointF y0;
    public final int z0;

    public sp8(Context context, long j, a aVar, om8 om8Var, xm8 xm8Var, op8 op8Var, kp8 kp8Var) {
        super(context);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = y6c.t0;
        this.M0 = i;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        this.q1 = kp8Var;
        byte b = 0;
        setPadding(0, 0, 0, kp8Var == null ? 0 : kp8Var.n);
        if (kp8Var != null) {
            kp8Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j;
        this.D0 = om8Var;
        this.A0 = aVar;
        rp8 rp8Var = new rp8(this, getContext(), xm8Var);
        this.E0 = rp8Var;
        setAdapter((kh2) rp8Var);
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = op8Var;
        b(new mp8((ym8) this));
        kk7.f(i).b(this, kk7.a0);
        kk7.f(i).b(this, kk7.X1);
        kk7.f(i).b(this, kk7.W1);
        kk7.f(i).b(this, kk7.b0);
        kk7.f(i).b(this, kk7.f3);
        w97 S0 = na7.q1(i).S0(j);
        this.T0 = S0;
        S0.h.getMessagesStorage().a.c(new u97(S0, b));
    }

    public final void A(gl5 gl5Var, gl5 gl5Var2) {
        this.Q0 = gl5Var;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, gl5Var);
        this.Z0.add(0, gl5Var2);
        this.a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.b1.add(0, -1);
        this.c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.r1 = gl5Var;
        this.s1 = gl5Var2;
    }

    public final void B(float f, int i) {
        int i2 = this.k1;
        float f2 = 0.0f;
        if (i2 >= 0 || this.l1 >= 0) {
            if (i2 < 0) {
                i2 = this.l1;
            }
            int k = this.E0.k(i);
            if (this.j1) {
                k--;
            }
            float f3 = k == i2 ? 1.0f - f : (getRealCount() <= 0 || (k + (-1)) % getRealCount() != i2) ? (getRealCount() <= 0 || (k + 1) % getRealCount() != i2) ? 0.0f : (1.0f - f) + 1.0f : (1.0f - f) - 1.0f;
            if (f3 > 1.0f) {
                f3 = 2.0f - f3;
            }
            f2 = Utilities.i(f3, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f2);
    }

    public final gl5 C(gl5 gl5Var, gl5 gl5Var2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (gl5Var == null) {
            return null;
        }
        int i = 0;
        while (i < 2) {
            ArrayList arrayList = i == 0 ? this.Z0 : this.Y0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gl5 gl5Var3 = (gl5) arrayList.get(i2);
                if (gl5Var3 != null && (tL_fileLocationToBeDeprecated = gl5Var3.f) != null) {
                    int i3 = gl5Var3.a;
                    if (i3 == gl5Var.a) {
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gl5Var.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (gl5) this.X0.get(i2);
                        }
                    }
                    if (i3 == gl5Var2.a) {
                        int i5 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gl5Var2.f;
                        if (i5 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (gl5) this.X0.get(i2);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
        return null;
    }

    public final gl5 D(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i >= arrayList.size()) {
            return null;
        }
        gl5 gl5Var = (gl5) this.X0.get(i);
        return gl5Var != null ? gl5Var : (gl5) arrayList.get(i);
    }

    public final View E(int i) {
        rp8 rp8Var = this.E0;
        if (rp8Var == null) {
            return null;
        }
        ArrayList arrayList = rp8Var.c;
        if (arrayList.size() <= i || i < 0) {
            return null;
        }
        pp8 pp8Var = (pp8) arrayList.get(i);
        qp8 qp8Var = pp8Var.b;
        return qp8Var == null ? pp8Var.c : qp8Var;
    }

    public final TLRPC.Photo F(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.W0;
        if (i < arrayList.size()) {
            return (TLRPC.Photo) arrayList.get(i);
        }
        return null;
    }

    public final gl5 G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i < arrayList.size()) {
            return (gl5) arrayList.get(i);
        }
        return null;
    }

    public final boolean H(i9c i9cVar, gl5 gl5Var, gl5 gl5Var2, boolean z) {
        w97 w97Var;
        w97 w97Var2;
        if (gl5Var != null && gl5Var2 != null && this.d1 == 0) {
            gl5 gl5Var3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (gl5Var3 == null || gl5Var3.f.local_id != gl5Var.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                rp8 rp8Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = gl5Var;
                    if (z && (w97Var2 = this.T0) != null) {
                        w97Var2.f();
                        this.T0.b(getCurrentItem() - (rp8Var != null ? rp8Var.j() : 0), true);
                    }
                    return true;
                }
                if (z && (w97Var = this.T0) != null) {
                    w97Var.f();
                    this.T0.b(getCurrentItem() - (rp8Var != null ? rp8Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = gl5Var;
                this.R0 = gl5Var2;
                this.S0 = i9cVar;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(gl5Var);
                this.Z0.add(gl5Var2);
                this.a1.add(i9cVar);
                this.X0.add(null);
                this.W0.add(null);
                this.b1.add(-1);
                this.c1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.j1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.X0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        be0 currentItemView;
        if (this.X0.get(this.j1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        km m = currentItemView.getImageReceiver().m();
        return m == null || !m.s();
    }

    public final void K() {
        this.q1 = null;
        int i = this.M0;
        kk7.f(i).n(this, kk7.a0);
        kk7.f(i).n(this, kk7.X1);
        kk7 f = kk7.f(i);
        int i2 = kk7.W1;
        f.n(this, i2);
        kk7.f(i).n(this, i2);
        kk7.f(i).n(this, kk7.b0);
        kk7.f(i).n(this, kk7.f3);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof be0) {
                be0 be0Var = (be0) childAt;
                if (be0Var.getImageReceiver().n0 != null) {
                    Drawable t = be0Var.getImageReceiver().t();
                    if (t instanceof km) {
                        ((km) t).w(be0Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.E0.j(), false);
    }

    public final void M(long j, boolean z) {
        if (this.F0 == j && !z) {
            L();
            return;
        }
        this.g1 = true;
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.Z0.clear();
        this.b1.clear();
        this.c1.clear();
        this.E0.g();
        x(0, false);
        this.p1 = 0;
        this.L0 = null;
        this.Q0 = null;
        this.F0 = j;
        w97 S0 = na7.q1(this.M0).S0(j);
        this.T0 = S0;
        S0.h.getMessagesStorage().a.c(new u97(S0, (byte) 0));
    }

    public final void N(int i, int i2) {
        this.n1 = i;
        this.o1 = i2;
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            ArrayList arrayList = rp8Var.c;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((pp8) arrayList.get(i3)).c != null) {
                    np8 np8Var = ((pp8) arrayList.get(i3)).c;
                    int i4 = this.n1;
                    int i5 = this.o1;
                    np8Var.s(i4, i4, i5, i5);
                }
            }
        }
    }

    public final void O(gl5 gl5Var, float f) {
        if (gl5Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.Y0;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) == gl5Var) {
                    this.c1.set(i, Float.valueOf(f));
                    SparseArray sparseArray = this.e1;
                    if (sparseArray.get(i) != null) {
                        ((RadialProgress2) sparseArray.get(i)).o(true, f);
                    }
                } else {
                    i++;
                }
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        w97 w97Var;
        TLRPC.User user;
        ArrayList arrayList;
        gl5 gl5Var;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gl5 gl5Var2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z3;
        TLRPC.User user2;
        boolean z4;
        int i5;
        boolean z5;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i6 = kk7.f3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i != i6) {
            int i7 = kk7.X1;
            SparseArray sparseArray = this.e1;
            if (i == i7) {
                String str = (String) objArr[0];
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    String str2 = (String) arrayList6.get(i8);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i8);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i8);
                        if (radialProgress2 != null) {
                            radialProgress2.o(true, 1.0f);
                        }
                        invalidate();
                    }
                }
                return;
            }
            if (i != kk7.W1) {
                if (i == kk7.b0 && this.d1 == 0 && (w97Var = this.T0) != null) {
                    w97Var.f();
                    w97 w97Var2 = this.T0;
                    int currentItem = getCurrentItem();
                    rp8 rp8Var = this.E0;
                    w97Var2.b(currentItem - (rp8Var != null ? rp8Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                String str4 = (String) arrayList6.get(i9);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i9);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i9);
                    if (radialProgress22 != null) {
                        radialProgress22.o(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
                    }
                    invalidate();
                }
            }
            return;
        }
        w97 w97Var3 = (w97) objArr[0];
        if (this.T0 == w97Var3) {
            ArrayList arrayList7 = new ArrayList(w97Var3.b);
            if (arrayList7.isEmpty() && w97Var3.c) {
                return;
            }
            this.k1 = -1;
            this.l1 = -1;
            int i10 = this.M0;
            TLRPC.User V1 = na7.q1(i10).V1(Long.valueOf(this.F0));
            TLRPC.UserFull W1 = na7.q1(i10).W1(this.F0);
            if (W1 != null && (photo = W1.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.k1 = 0;
            }
            if (V1 != null && V1.self && l7c.r(W1)) {
                arrayList7.add(W1.fallback_photo);
                this.l1 = arrayList7.size() - 1;
            }
            arrayList5.clear();
            arrayList6.clear();
            ArrayList arrayList8 = this.Y0;
            arrayList8.clear();
            ArrayList arrayList9 = this.X0;
            arrayList9.clear();
            ArrayList arrayList10 = this.Z0;
            arrayList10.clear();
            ArrayList arrayList11 = this.a1;
            arrayList11.clear();
            ArrayList arrayList12 = this.W0;
            arrayList12.clear();
            ArrayList arrayList13 = this.b1;
            arrayList13.clear();
            ArrayList arrayList14 = this.c1;
            arrayList14.clear();
            if (cf3.y(this.F0)) {
                TLRPC.Chat K0 = na7.q1(i10).K0(Long.valueOf(-this.F0));
                gl5Var = gl5.m(i10, 0, K0);
                arrayList = arrayList8;
                if (gl5Var != null) {
                    arrayList.add(gl5Var);
                    user = V1;
                    arrayList10.add(gl5.m(i10, 1, K0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.G0;
                    if (chatFull == null || !ba4.U(gl5Var.f, chatFull.chat_photo)) {
                        z5 = false;
                        arrayList12.add(null);
                        arrayList6.add(null);
                        arrayList9.add(null);
                    } else {
                        arrayList12.add(this.G0.chat_photo);
                        if (this.G0.chat_photo.video_sizes.isEmpty()) {
                            z5 = false;
                            arrayList9.add(null);
                            arrayList6.add(null);
                        } else {
                            TLRPC.VideoSize x = ba4.x(1000, this.G0.chat_photo.video_sizes);
                            arrayList9.add(gl5.j(x, this.G0.chat_photo));
                            z5 = false;
                            arrayList6.add(ba4.r(null, x));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z5);
                } else {
                    user = V1;
                }
            } else {
                user = V1;
                arrayList = arrayList8;
                gl5Var = null;
            }
            int i11 = 0;
            while (true) {
                int size = arrayList7.size();
                i3 = i10;
                z = this.K0;
                if (i11 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i11);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                    i4 = i11;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList14;
                    gl5Var2 = gl5Var;
                    num = num2;
                    arrayList12.add(null);
                    arrayList.add(null);
                    arrayList10.add(null);
                    arrayList11.add(null);
                    arrayList5.add(null);
                    arrayList9.add(null);
                    arrayList6.add(null);
                    arrayList13.add(num);
                    arrayList3.add(null);
                } else {
                    i4 = i11;
                    arrayList2 = arrayList7;
                    ArrayList arrayList15 = arrayList14;
                    TLRPC.PhotoSize w = ba4.w(arrayList4, 50, false, null, false);
                    int size2 = photo2.sizes.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = photo2.sizes.get(i12);
                        TLRPC.PhotoSize photoSize2 = w;
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            w = photoSize;
                            break;
                        } else {
                            i12++;
                            w = photoSize2;
                        }
                    }
                    if (gl5Var != null) {
                        int size3 = photo2.sizes.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i13).location;
                            int i14 = size3;
                            if (fileLocation != null) {
                                int i15 = fileLocation.local_id;
                                i5 = i13;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var.f;
                                gl5Var2 = gl5Var;
                                if (i15 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, gl5.j(ba4.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i13 = i5 + 1;
                                        num2 = num;
                                        size3 = i14;
                                        gl5Var = gl5Var2;
                                    }
                                }
                            } else {
                                i5 = i13;
                                gl5Var2 = gl5Var;
                            }
                            num = num2;
                            i13 = i5 + 1;
                            num2 = num;
                            size3 = i14;
                            gl5Var = gl5Var2;
                        }
                    }
                    gl5Var2 = gl5Var;
                    num = num2;
                    TLRPC.PhotoSize w2 = ba4.w(photo2.sizes, 640, false, null, false);
                    if (w2 != null) {
                        int i16 = photo2.dc_id;
                        if (i16 != 0) {
                            TLRPC.FileLocation fileLocation2 = w2.location;
                            fileLocation2.dc_id = i16;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        gl5 i17 = gl5.i(w2, photo2);
                        if (i17 != null) {
                            gl5 gl5Var3 = this.Q0;
                            if (gl5Var3 == null || gl5Var3.s != i17.s || z || this.F0 == y6c.h(i3).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i17);
                                arrayList5.add(ba4.r(null, w instanceof TLRPC.TL_photoStrippedSize ? w2 : w));
                                arrayList10.add(gl5.i(w, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z3 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x2 = ba4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R = ba4.R(photo2);
                                    if (R != null) {
                                        user = user3;
                                        arrayList11.add(new i9c(R, user3 != null && user3.premium, 2));
                                        z3 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z3 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(gl5.j(x2, photo2));
                                        arrayList6.add(ba4.r(null, x2));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w2.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z3);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.Q0);
                                gl5 gl5Var4 = this.R0;
                                if (gl5Var4 == null) {
                                    gl5Var4 = gl5.i(w, photo2);
                                }
                                arrayList10.add(gl5Var4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z4 = false;
                                    arrayList11.add(this.S0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x3 = ba4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R2 = ba4.R(photo2);
                                    if (R2 != null) {
                                        user2 = user;
                                        arrayList11.add(new i9c(R2, user != null && user2.premium, 2));
                                        z4 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z4 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(gl5.j(x3, photo2));
                                        arrayList6.add(ba4.r(null, x3));
                                    }
                                }
                                arrayList12.add(z4);
                                arrayList13.add(num);
                                arrayList3 = arrayList15;
                                arrayList3.add(z4);
                                user = user2;
                            }
                        }
                    }
                    arrayList3 = arrayList15;
                }
                i11 = i4 + 1;
                arrayList14 = arrayList3;
                num2 = num;
                i10 = i3;
                arrayList7 = arrayList2;
                gl5Var = gl5Var2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i18 = 0;
                while (true) {
                    if (i18 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    ba4.G(i3).V((gl5) arrayList10.get(i18 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i18++;
                }
            }
            getAdapter().g();
            boolean z6 = this.I0;
            if (z) {
                if (!z6 || this.g1) {
                    L();
                }
            } else if (!z6 || this.g1) {
                L();
                getAdapter().g();
                B(0.0f, getRealPosition());
            }
            if (this.l1 >= 0 || this.k1 >= 0) {
                z2 = false;
            } else {
                z2 = false;
                B(0.0f, 0);
            }
            this.g1 = z2;
            op8 op8Var = this.H0;
            if (op8Var != null) {
                op8Var.c();
            }
            gl5 gl5Var5 = this.r1;
            if (gl5Var5 != null) {
                A(gl5Var5, this.s1);
            }
        }
    }

    public kp8 getBlurDrawer() {
        return this.q1;
    }

    public float getCurrentItemProgress() {
        km m;
        be0 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m.n();
    }

    public be0 getCurrentItemView() {
        rp8 rp8Var = this.E0;
        if (rp8Var == null) {
            return null;
        }
        ArrayList arrayList = rp8Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((pp8) arrayList.get(getCurrentItem())).c;
    }

    public long getDialogId() {
        return this.F0;
    }

    public int getRealCount() {
        int size = this.W0.size();
        return this.j1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.E0.k(getCurrentItem());
    }

    @Override // gec, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // gec, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setTranslationY(getHeight() - this.q1.getMeasuredHeight());
        }
    }

    @Override // gec, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.H = true;
            kp8Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0169, code lost:
    
        if (r0 > r5) goto L84;
     */
    @Override // gec, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            o39 o39Var = this.D0;
            if (o39Var.getScrollState() != 0 && !this.B0 && this.C0) {
                this.C0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            ma8 ma8Var = this.i1;
            op8 op8Var = this.H0;
            if (ma8Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.J0) {
                    ma8 ma8Var2 = this.i1;
                    if (!ma8Var2.n) {
                        ma8Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.i1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.J0) {
                        this.J0 = true;
                        if (op8Var != null) {
                            op8Var.a();
                        }
                    }
                    return true;
                }
            }
            PointF pointF = this.y0;
            if (action == 0) {
                this.B0 = true;
                this.C0 = true;
                this.I0 = true;
                pointF.set(motionEvent.getX(), motionEvent.getY());
                if (rp8Var.c.size() > 1 && op8Var != null) {
                    op8Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.J0 = false;
            } else if (action == 1) {
                if (!this.J0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i = rp8Var.j();
                            int i2 = currentItem + 1;
                            if (i2 < realCount + i) {
                                i = i2;
                            }
                        } else {
                            int i3 = (-1) + currentItem;
                            i = i3 < rp8Var.j() ? (realCount + r0) - 1 : i3;
                        }
                        if (op8Var != null) {
                            op8Var.a();
                        }
                        x(i, false);
                    }
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - pointF.x;
                float y = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y);
                float f = this.z0;
                boolean z = abs >= f || Math.abs(x) >= f;
                if (z) {
                    this.J0 = true;
                    if (op8Var != null) {
                        op8Var.a();
                    }
                }
                if (this.C0) {
                    if (this.B0) {
                        if (z) {
                            if (Math.abs(y) > Math.abs(x)) {
                                this.C0 = false;
                                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                obtain2.setAction(3);
                                super.onTouchEvent(obtain2);
                                obtain2.recycle();
                            } else {
                                this.B0 = false;
                                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                                obtain3.setAction(3);
                                o39Var.onTouchEvent(obtain3);
                                obtain3.recycle();
                            }
                        }
                    } else if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.B0 ? o39Var.onTouchEvent(motionEvent) : false;
            if (this.C0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            if (action == 1 || action == 3) {
                this.B0 = false;
                this.C0 = false;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setAlpha(f);
        }
    }

    public void setAnimatedFileMaybe(km kmVar) {
        rp8 rp8Var;
        if (kmVar == null || (rp8Var = this.E0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof be0) && rp8Var.k(rp8Var.d.indexOf(childAt)) == 0) {
                be0 be0Var = (be0) childAt;
                km m = be0Var.getImageReceiver().m();
                if (m != kmVar) {
                    if (m != null) {
                        m.w(be0Var);
                    }
                    be0Var.setImageDrawable(kmVar);
                    kmVar.f(this);
                    kmVar.S = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G0 = chatFull;
        ArrayList arrayList = this.W0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.G0 == null) {
            return;
        }
        ArrayList arrayList2 = this.Y0;
        if (arrayList2.get(0) == null || !ba4.U(((gl5) arrayList2.get(0)).f, this.G0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.G0.chat_photo);
        boolean isEmpty = this.G0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.U0;
        ArrayList arrayList4 = this.X0;
        if (isEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize x = ba4.x(1000, this.G0.chat_photo.video_sizes);
            arrayList4.set(0, gl5.j(x, this.G0.chat_photo));
            arrayList3.set(0, ba4.r(null, x));
            op8 op8Var = this.H0;
            if (op8Var != null) {
                op8Var.c();
            }
        }
        this.c1.set(0, null);
        this.E0.g();
    }

    public void setCreateThumbFromParent(boolean z) {
        this.f1 = z;
    }

    public void setData(long j) {
        M(j, false);
    }

    public void setHasActiveVideo(boolean z) {
        this.j1 = z;
    }

    public void setImagesLayerNum(int i) {
        this.m1 = i;
    }

    public void setInvalidateWithParent(boolean z) {
        this.h1 = z;
    }

    public void setParentAvatarImage(be0 be0Var) {
        rp8 rp8Var = this.E0;
        if (rp8Var != null) {
            rp8Var.g = be0Var;
        }
    }

    public void setPinchToZoomHelper(ma8 ma8Var) {
        this.i1 = ma8Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        kp8 kp8Var = this.q1;
        if (kp8Var != null) {
            kp8Var.setVisibility(i);
        }
    }

    public void setCustomAvatarProgress(float f) {
    }

    public sp8(Activity activity, a aVar, o39 o39Var, qb0 qb0Var) {
        super(activity);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = y6c.t0;
        this.M0 = i;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        setOffscreenPageLimit(2);
        this.q1 = null;
        this.K0 = false;
        this.D0 = o39Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = aVar;
        this.z0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.H0 = qb0Var;
        b(new lp8(this));
        rp8 rp8Var = new rp8(this, getContext(), null);
        this.E0 = rp8Var;
        setAdapter((kh2) rp8Var);
        kk7.f(i).b(this, kk7.a0);
        kk7.f(i).b(this, kk7.X1);
        kk7.f(i).b(this, kk7.W1);
        kk7.f(i).b(this, kk7.b0);
        kk7.f(i).b(this, kk7.f3);
        this.T0 = null;
    }
}
