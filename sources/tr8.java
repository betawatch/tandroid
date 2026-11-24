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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class tr8 extends zi2 implements jm7 {
    public final a A0;
    public boolean B0;
    public boolean C0;
    public final r59 D0;
    public final sr8 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final pr8 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public gn5 L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public gn5 Q0;
    public gn5 R0;
    public jbc S0;
    public xb7 T0;
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
    public pc8 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public lr8 q1;
    public gn5 r1;
    public gn5 s1;
    public final PointF y0;
    public final int z0;

    public tr8(Context context, long j, a aVar, po8 po8Var, yo8 yo8Var, pr8 pr8Var, lr8 lr8Var) {
        super(context);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = z8c.t0;
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
        this.q1 = lr8Var;
        byte b = 0;
        setPadding(0, 0, 0, lr8Var == null ? 0 : lr8Var.n);
        if (lr8Var != null) {
            lr8Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j;
        this.D0 = po8Var;
        this.A0 = aVar;
        sr8 sr8Var = new sr8(this, getContext(), yo8Var);
        this.E0 = sr8Var;
        setAdapter((yi2) sr8Var);
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = pr8Var;
        b(new nr8((zo8) this));
        nm7.f(i).b(this, nm7.b0);
        nm7.f(i).b(this, nm7.Y1);
        nm7.f(i).b(this, nm7.X1);
        nm7.f(i).b(this, nm7.c0);
        nm7.f(i).b(this, nm7.g3);
        xb7 T0 = oc7.r1(i).T0(j);
        this.T0 = T0;
        T0.h.getMessagesStorage().a.c(new vb7(T0, b));
    }

    public final void A(gn5 gn5Var, gn5 gn5Var2) {
        this.Q0 = gn5Var;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, gn5Var);
        this.Z0.add(0, gn5Var2);
        this.a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.b1.add(0, -1);
        this.c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.r1 = gn5Var;
        this.s1 = gn5Var2;
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

    public final gn5 C(gn5 gn5Var, gn5 gn5Var2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (gn5Var == null) {
            return null;
        }
        int i = 0;
        while (i < 2) {
            ArrayList arrayList = i == 0 ? this.Z0 : this.Y0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gn5 gn5Var3 = (gn5) arrayList.get(i2);
                if (gn5Var3 != null && (tL_fileLocationToBeDeprecated = gn5Var3.f) != null) {
                    int i3 = gn5Var3.a;
                    if (i3 == gn5Var.a) {
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (gn5) this.X0.get(i2);
                        }
                    }
                    if (i3 == gn5Var2.a) {
                        int i5 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gn5Var2.f;
                        if (i5 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (gn5) this.X0.get(i2);
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

    public final gn5 D(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i >= arrayList.size()) {
            return null;
        }
        gn5 gn5Var = (gn5) this.X0.get(i);
        return gn5Var != null ? gn5Var : (gn5) arrayList.get(i);
    }

    public final View E(int i) {
        sr8 sr8Var = this.E0;
        if (sr8Var == null) {
            return null;
        }
        ArrayList arrayList = sr8Var.c;
        if (arrayList.size() <= i || i < 0) {
            return null;
        }
        qr8 qr8Var = (qr8) arrayList.get(i);
        rr8 rr8Var = qr8Var.b;
        return rr8Var == null ? qr8Var.c : rr8Var;
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

    public final gn5 G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i < arrayList.size()) {
            return (gn5) arrayList.get(i);
        }
        return null;
    }

    public final boolean H(jbc jbcVar, gn5 gn5Var, gn5 gn5Var2, boolean z) {
        xb7 xb7Var;
        xb7 xb7Var2;
        if (gn5Var != null && gn5Var2 != null && this.d1 == 0) {
            gn5 gn5Var3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (gn5Var3 == null || gn5Var3.f.local_id != gn5Var.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                sr8 sr8Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = gn5Var;
                    if (z && (xb7Var2 = this.T0) != null) {
                        xb7Var2.f();
                        this.T0.b(getCurrentItem() - (sr8Var != null ? sr8Var.j() : 0), true);
                    }
                    return true;
                }
                if (z && (xb7Var = this.T0) != null) {
                    xb7Var.f();
                    this.T0.b(getCurrentItem() - (sr8Var != null ? sr8Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = gn5Var;
                this.R0 = gn5Var2;
                this.S0 = jbcVar;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(gn5Var);
                this.Z0.add(gn5Var2);
                this.a1.add(jbcVar);
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
        bf0 currentItemView;
        if (this.X0.get(this.j1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        kn m = currentItemView.getImageReceiver().m();
        return m == null || !m.s();
    }

    public final void K() {
        this.q1 = null;
        int i = this.M0;
        nm7.f(i).n(this, nm7.b0);
        nm7.f(i).n(this, nm7.Y1);
        nm7 f = nm7.f(i);
        int i2 = nm7.X1;
        f.n(this, i2);
        nm7.f(i).n(this, i2);
        nm7.f(i).n(this, nm7.c0);
        nm7.f(i).n(this, nm7.g3);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof bf0) {
                bf0 bf0Var = (bf0) childAt;
                if (bf0Var.getImageReceiver().n0 != null) {
                    Drawable t = bf0Var.getImageReceiver().t();
                    if (t instanceof kn) {
                        ((kn) t).w(bf0Var);
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
        xb7 T0 = oc7.r1(this.M0).T0(j);
        this.T0 = T0;
        T0.h.getMessagesStorage().a.c(new vb7(T0, (byte) 0));
    }

    public final void N(int i, int i2) {
        this.n1 = i;
        this.o1 = i2;
        sr8 sr8Var = this.E0;
        if (sr8Var != null) {
            ArrayList arrayList = sr8Var.c;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((qr8) arrayList.get(i3)).c != null) {
                    or8 or8Var = ((qr8) arrayList.get(i3)).c;
                    int i4 = this.n1;
                    int i5 = this.o1;
                    or8Var.s(i4, i4, i5, i5);
                }
            }
        }
    }

    public final void O(gn5 gn5Var, float f) {
        if (gn5Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.Y0;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) == gn5Var) {
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

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xb7 xb7Var;
        TLRPC.User user;
        ArrayList arrayList;
        gn5 gn5Var;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        gn5 gn5Var2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z3;
        TLRPC.User user2;
        boolean z4;
        int i5;
        boolean z5;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i6 = nm7.g3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i != i6) {
            int i7 = nm7.Y1;
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
            if (i != nm7.X1) {
                if (i == nm7.c0 && this.d1 == 0 && (xb7Var = this.T0) != null) {
                    xb7Var.f();
                    xb7 xb7Var2 = this.T0;
                    int currentItem = getCurrentItem();
                    sr8 sr8Var = this.E0;
                    xb7Var2.b(currentItem - (sr8Var != null ? sr8Var.j() : 0), true);
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
        xb7 xb7Var3 = (xb7) objArr[0];
        if (this.T0 == xb7Var3) {
            ArrayList arrayList7 = new ArrayList(xb7Var3.b);
            if (arrayList7.isEmpty() && xb7Var3.c) {
                return;
            }
            this.k1 = -1;
            this.l1 = -1;
            int i10 = this.M0;
            TLRPC.User W1 = oc7.r1(i10).W1(Long.valueOf(this.F0));
            TLRPC.UserFull X1 = oc7.r1(i10).X1(this.F0);
            if (X1 != null && (photo = X1.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.k1 = 0;
            }
            if (W1 != null && W1.self && m9c.s(X1)) {
                arrayList7.add(X1.fallback_photo);
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
            if (pg3.y(this.F0)) {
                TLRPC.Chat L0 = oc7.r1(i10).L0(Long.valueOf(-this.F0));
                gn5Var = gn5.m(i10, 0, L0);
                arrayList = arrayList8;
                if (gn5Var != null) {
                    arrayList.add(gn5Var);
                    user = W1;
                    arrayList10.add(gn5.m(i10, 1, L0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.G0;
                    if (chatFull == null || !bc4.U(gn5Var.f, chatFull.chat_photo)) {
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
                            TLRPC.VideoSize x = bc4.x(1000, this.G0.chat_photo.video_sizes);
                            arrayList9.add(gn5.j(x, this.G0.chat_photo));
                            z5 = false;
                            arrayList6.add(bc4.r(null, x));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z5);
                } else {
                    user = W1;
                }
            } else {
                user = W1;
                arrayList = arrayList8;
                gn5Var = null;
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
                    gn5Var2 = gn5Var;
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
                    TLRPC.PhotoSize w = bc4.w(arrayList4, 50, false, null, false);
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
                    if (gn5Var != null) {
                        int size3 = photo2.sizes.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i13).location;
                            int i14 = size3;
                            if (fileLocation != null) {
                                int i15 = fileLocation.local_id;
                                i5 = i13;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var.f;
                                gn5Var2 = gn5Var;
                                if (i15 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, gn5.j(bc4.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i13 = i5 + 1;
                                        num2 = num;
                                        size3 = i14;
                                        gn5Var = gn5Var2;
                                    }
                                }
                            } else {
                                i5 = i13;
                                gn5Var2 = gn5Var;
                            }
                            num = num2;
                            i13 = i5 + 1;
                            num2 = num;
                            size3 = i14;
                            gn5Var = gn5Var2;
                        }
                    }
                    gn5Var2 = gn5Var;
                    num = num2;
                    TLRPC.PhotoSize w2 = bc4.w(photo2.sizes, 640, false, null, false);
                    if (w2 != null) {
                        int i16 = photo2.dc_id;
                        if (i16 != 0) {
                            TLRPC.FileLocation fileLocation2 = w2.location;
                            fileLocation2.dc_id = i16;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        gn5 i17 = gn5.i(w2, photo2);
                        if (i17 != null) {
                            gn5 gn5Var3 = this.Q0;
                            if (gn5Var3 == null || gn5Var3.s != i17.s || z || this.F0 == z8c.h(i3).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i17);
                                arrayList5.add(bc4.r(null, w instanceof TLRPC.TL_photoStrippedSize ? w2 : w));
                                arrayList10.add(gn5.i(w, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z3 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x2 = bc4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R = bc4.R(photo2);
                                    if (R != null) {
                                        user = user3;
                                        arrayList11.add(new jbc(R, user3 != null && user3.premium, 2));
                                        z3 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z3 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(gn5.j(x2, photo2));
                                        arrayList6.add(bc4.r(null, x2));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w2.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z3);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.Q0);
                                gn5 gn5Var4 = this.R0;
                                if (gn5Var4 == null) {
                                    gn5Var4 = gn5.i(w, photo2);
                                }
                                arrayList10.add(gn5Var4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z4 = false;
                                    arrayList11.add(this.S0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x3 = bc4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R2 = bc4.R(photo2);
                                    if (R2 != null) {
                                        user2 = user;
                                        arrayList11.add(new jbc(R2, user != null && user2.premium, 2));
                                        z4 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z4 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(gn5.j(x3, photo2));
                                        arrayList6.add(bc4.r(null, x3));
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
                gn5Var = gn5Var2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i18 = 0;
                while (true) {
                    if (i18 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    bc4.G(i3).V((gn5) arrayList10.get(i18 == 0 ? 1 : size4 - 1), null, null, 0, 1);
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
            pr8 pr8Var = this.H0;
            if (pr8Var != null) {
                pr8Var.c();
            }
            gn5 gn5Var5 = this.r1;
            if (gn5Var5 != null) {
                A(gn5Var5, this.s1);
            }
        }
    }

    public lr8 getBlurDrawer() {
        return this.q1;
    }

    public float getCurrentItemProgress() {
        kn m;
        bf0 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m.n();
    }

    public bf0 getCurrentItemView() {
        sr8 sr8Var = this.E0;
        if (sr8Var == null) {
            return null;
        }
        ArrayList arrayList = sr8Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((qr8) arrayList.get(getCurrentItem())).c;
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

    @Override // ggc, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // ggc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lr8 lr8Var = this.q1;
        if (lr8Var != null) {
            lr8Var.setTranslationY(getHeight() - this.q1.getMeasuredHeight());
        }
    }

    @Override // ggc, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lr8 lr8Var = this.q1;
        if (lr8Var != null) {
            lr8Var.H = true;
            lr8Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0169, code lost:
    
        if (r0 > r5) goto L84;
     */
    @Override // ggc, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        sr8 sr8Var = this.E0;
        if (sr8Var != null) {
            r59 r59Var = this.D0;
            if (r59Var.getScrollState() != 0 && !this.B0 && this.C0) {
                this.C0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            pc8 pc8Var = this.i1;
            pr8 pr8Var = this.H0;
            if (pc8Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.J0) {
                    pc8 pc8Var2 = this.i1;
                    if (!pc8Var2.n) {
                        pc8Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.i1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.J0) {
                        this.J0 = true;
                        if (pr8Var != null) {
                            pr8Var.a();
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
                if (sr8Var.c.size() > 1 && pr8Var != null) {
                    pr8Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.J0 = false;
            } else if (action == 1) {
                if (!this.J0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i = sr8Var.j();
                            int i2 = currentItem + 1;
                            if (i2 < realCount + i) {
                                i = i2;
                            }
                        } else {
                            int i3 = (-1) + currentItem;
                            i = i3 < sr8Var.j() ? (realCount + r0) - 1 : i3;
                        }
                        if (pr8Var != null) {
                            pr8Var.a();
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
                    if (pr8Var != null) {
                        pr8Var.a();
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
                                r59Var.onTouchEvent(obtain3);
                                obtain3.recycle();
                            }
                        }
                    } else if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.B0 ? r59Var.onTouchEvent(motionEvent) : false;
            if (this.C0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    fc4.g(e, true);
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
        lr8 lr8Var = this.q1;
        if (lr8Var != null) {
            lr8Var.setAlpha(f);
        }
    }

    public void setAnimatedFileMaybe(kn knVar) {
        sr8 sr8Var;
        if (knVar == null || (sr8Var = this.E0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof bf0) && sr8Var.k(sr8Var.d.indexOf(childAt)) == 0) {
                bf0 bf0Var = (bf0) childAt;
                kn m = bf0Var.getImageReceiver().m();
                if (m != knVar) {
                    if (m != null) {
                        m.w(bf0Var);
                    }
                    bf0Var.setImageDrawable(knVar);
                    knVar.f(this);
                    knVar.S = true;
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
        if (arrayList2.get(0) == null || !bc4.U(((gn5) arrayList2.get(0)).f, this.G0.chat_photo)) {
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
            TLRPC.VideoSize x = bc4.x(1000, this.G0.chat_photo.video_sizes);
            arrayList4.set(0, gn5.j(x, this.G0.chat_photo));
            arrayList3.set(0, bc4.r(null, x));
            pr8 pr8Var = this.H0;
            if (pr8Var != null) {
                pr8Var.c();
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

    public void setParentAvatarImage(bf0 bf0Var) {
        sr8 sr8Var = this.E0;
        if (sr8Var != null) {
            sr8Var.g = bf0Var;
        }
    }

    public void setPinchToZoomHelper(pc8 pc8Var) {
        this.i1 = pc8Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        lr8 lr8Var = this.q1;
        if (lr8Var != null) {
            lr8Var.setVisibility(i);
        }
    }

    public void setCustomAvatarProgress(float f) {
    }

    public tr8(Activity activity, a aVar, r59 r59Var, qc0 qc0Var) {
        super(activity);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = z8c.t0;
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
        this.D0 = r59Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = aVar;
        this.z0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.H0 = qc0Var;
        b(new mr8(this));
        sr8 sr8Var = new sr8(this, getContext(), null);
        this.E0 = sr8Var;
        setAdapter((yi2) sr8Var);
        nm7.f(i).b(this, nm7.b0);
        nm7.f(i).b(this, nm7.Y1);
        nm7.f(i).b(this, nm7.X1);
        nm7.f(i).b(this, nm7.c0);
        nm7.f(i).b(this, nm7.g3);
        this.T0 = null;
    }
}
