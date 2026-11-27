// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class wd5 extends View implements GestureDetector.OnGestureListener {
    public float E;
    public float F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Scroller O;
    public final GestureDetector P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Paint a;
    public vd5 a0;
    public final ArrayList b;
    public ValueAnimator b0;
    public final ArrayList c;
    public ValueAnimator c0;
    public final ArrayList d;
    public float d0;
    public final ArrayList e;
    public int f;
    public long h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public int x;
    public float y;

    public wd5(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = 1.0f;
        this.F = 0.0f;
        this.M = -1;
        this.T = true;
        this.U = -1;
        this.W = true;
        this.P = new GestureDetector(contextThemeWrapper, this);
        this.O = new Scroller(contextThemeWrapper);
        this.n = hl.L(42.0f);
        this.r = hl.L(56.0f);
        this.w = hl.L(1.0f);
        this.s = i;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.A1 = false;
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.c.add(imageReceiver);
        imageReceiver.d = ((jb8) this.a0).a.U;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return (this.n + (this.w << 1)) * this.f;
    }

    private int getMinScrollX() {
        return (this.n + (this.w << 1)) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i, boolean z) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = false;
            this.y = 1.0f;
            this.E = 1.0f;
            this.F = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (arrayList3.isEmpty()) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth() / 2;
            int i4 = this.n;
            int i5 = measuredWidth2 - (i4 / 2);
            int i6 = this.w;
            if (z) {
                int size = arrayList2.size();
                int i7 = 0;
                i2 = Integer.MIN_VALUE;
                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i7 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i7);
                    int i8 = imageReceiver.f;
                    int i9 = ((i4 + i6) * (i8 - this.f)) + i5 + i;
                    if (i9 > measuredWidth || i9 + i4 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i7);
                        size--;
                        i7--;
                    }
                    i3 = Math.min(i3, i8 - 1);
                    i2 = Math.max(i2, i8 + 1);
                    i7++;
                }
            } else {
                i2 = this.f;
                i3 = i2 - 1;
            }
            int i10 = this.r;
            int i11 = this.s;
            ArrayList arrayList4 = this.e;
            if (i2 != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (i2 < size2) {
                    int i12 = ((i4 + i6) * (i2 - this.f)) + i5 + i;
                    if (i12 >= measuredWidth) {
                        break;
                    }
                    jn5 jn5Var = (jn5) arrayList3.get(i2);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i13 = measuredWidth;
                    int i14 = i5;
                    freeReceiver.i0(i12, i11, i4, i10);
                    if (arrayList4.get(0) instanceof r47) {
                        obj2 = arrayList4.get(i2);
                    } else {
                        boolean z2 = arrayList4.get(0) instanceof TL_iv.PageBlock;
                        vd5 vd5Var = this.a0;
                        if (z2) {
                            bd8 bd8Var = ((jb8) vd5Var).a.i7;
                            obj2 = bd8Var != null ? bd8Var.g() : null;
                        } else {
                            obj2 = "avatar_" + ((jb8) vd5Var).a.y5;
                        }
                    }
                    freeReceiver.Z(null, null, jn5Var, "80_80", null, 0L, null, obj2, 1);
                    freeReceiver.f = i2;
                    i2++;
                    measuredWidth = i13;
                    i5 = i14;
                }
            }
            int i15 = i5;
            if (i3 != Integer.MAX_VALUE) {
                while (i3 >= 0) {
                    int i16 = ((i4 + i6) * (i3 - this.f)) + i15 + i + i4;
                    if (i16 <= 0) {
                        break;
                    }
                    jn5 jn5Var2 = (jn5) arrayList3.get(i3);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.i0(i16, i11, i4, i10);
                    if (arrayList4.get(0) instanceof r47) {
                        obj = arrayList4.get(i3);
                    } else {
                        boolean z3 = arrayList4.get(0) instanceof TL_iv.PageBlock;
                        vd5 vd5Var2 = this.a0;
                        if (z3) {
                            bd8 bd8Var2 = ((jb8) vd5Var2).a.i7;
                            obj = bd8Var2 != null ? bd8Var2.g() : null;
                        } else {
                            obj = "avatar_" + ((jb8) vd5Var2).a.y5;
                        }
                    }
                    freeReceiver2.Z(null, null, jn5Var2, "80_80", null, 0L, null, obj, 1);
                    freeReceiver2.f = i3;
                    i3--;
                }
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.b0.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        byte b;
        long j;
        Object obj;
        int i;
        boolean z;
        TL_iv.PageBlock pageBlock;
        int i2;
        int i3;
        ed8 ed8Var;
        boolean z2;
        int i4;
        byte b2 = 0;
        if (this.S) {
            this.S = false;
            return;
        }
        PhotoViewer photoViewer = ((jb8) this.a0).a;
        int i5 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        bd8 bd8Var = photoViewer.i7;
        List all = bd8Var != null ? bd8Var.getAll() : null;
        int i6 = ((jb8) this.a0).a.w;
        this.V = false;
        long j2 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i5 >= arrayList.size()) {
                i5 = arrayList.size() - 1;
            }
            jn5 jn5Var = (jn5) arrayList.get(i5);
            int size = arrayList.size();
            this.V = true;
            b = 0;
            j = 0;
            i = size;
            z = false;
            obj = jn5Var;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            b = 0;
            j = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i = 0;
                z = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i5);
                long j3 = pageBlock2.groupId;
                long j4 = this.h;
                if (j3 != j4) {
                    this.h = j3;
                    z = true;
                } else {
                    j3 = j4;
                    z = false;
                }
                if (j3 != 0) {
                    this.V = true;
                    int size2 = all.size();
                    int i7 = i5;
                    i = 0;
                    TL_iv.PageBlock pageBlock3 = pageBlock2;
                    while (true) {
                        if (i7 >= size2) {
                            pageBlock = pageBlock3;
                            break;
                        }
                        pageBlock = pageBlock3;
                        if (((TL_iv.PageBlock) all.get(i7)).groupId != this.h) {
                            break;
                        }
                        i++;
                        i7++;
                        pageBlock3 = pageBlock;
                    }
                    for (int i8 = i5 - 1; i8 >= 0 && ((TL_iv.PageBlock) all.get(i8)).groupId == this.h; i8--) {
                        i++;
                    }
                    obj = pageBlock;
                } else {
                    i = 0;
                    obj = pageBlock2;
                }
            }
        } else {
            if (i5 >= arrayList2.size()) {
                i5 = arrayList2.size() - 1;
            }
            r47 r47Var = (r47) arrayList2.get(i5);
            long d1 = r47Var.d1();
            if (d1 != this.h) {
                this.h = d1;
                z = true;
            } else {
                z = false;
            }
            boolean z3 = arrayList2.size() > 1 && (ed8Var = ((jb8) this.a0).a.d) != null && ed8Var.K();
            if (this.h != 0 || z3) {
                this.V = true;
                int min = Math.min(i5 + 10, arrayList2.size());
                i2 = 0;
                int i9 = i5;
                while (true) {
                    if (i9 >= min) {
                        j = j2;
                        break;
                    }
                    r47 r47Var2 = (r47) arrayList2.get(i9);
                    if (i6 == 0 && !z3) {
                        j = j2;
                        if (r47Var2.d1() != this.h) {
                            break;
                        }
                    } else {
                        j = j2;
                    }
                    i2++;
                    i9++;
                    j2 = j;
                }
                int max = Math.max(i5 - 10, 0);
                int i10 = i5 - 1;
                while (true) {
                    if (i10 < max) {
                        b = b2;
                        i3 = i5;
                        break;
                    }
                    r47 r47Var3 = (r47) arrayList2.get(i10);
                    if (i6 == 0 && !z3) {
                        b = b2;
                        i3 = i5;
                        if (r47Var3.d1() != this.h) {
                            break;
                        }
                    } else {
                        b = b2;
                        i3 = i5;
                    }
                    i2++;
                    i10--;
                    b2 = b;
                    i5 = i3;
                }
            } else {
                i2 = 0;
                b = 0;
                i3 = i5;
                j = 0;
            }
            i = i2;
            i5 = i3;
            obj = r47Var;
        }
        if (obj == null) {
            return;
        }
        boolean z4 = this.T;
        ArrayList arrayList3 = this.d;
        if (z4) {
            if (this.V) {
                ValueAnimator valueAnimator = this.c0;
                if (valueAnimator != null) {
                    this.c0 = null;
                    valueAnimator.cancel();
                }
                float f = this.d0;
                if (f < 1.0f && this.b0 == null) {
                    final byte b3 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 1.0f);
                    this.b0 = ofFloat;
                    ofFloat.setDuration((long) ((1.0f - this.d0) * 200.0f));
                    this.b0.addListener(new ud5(this, b3));
                    this.b0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: td5
                        public final /* synthetic */ wd5 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            byte b4 = b3;
                            wd5 wd5Var = this.b;
                            wd5Var.getClass();
                            switch (b4) {
                                case 0:
                                    wd5Var.d0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    wd5Var.invalidate();
                                    break;
                                default:
                                    wd5Var.d0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    wd5Var.invalidate();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ValueAnimator valueAnimator2 = this.b0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.b0 = null;
                }
                if (this.d0 > 0.0f && arrayList3.size() > 1) {
                    if (this.c0 == null) {
                        float[] fArr = new float[2];
                        fArr[b] = this.d0;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                        this.c0 = ofFloat2;
                        ofFloat2.setDuration((long) (this.d0 * 200.0f));
                        final byte b4 = b;
                        this.c0.addListener(new ud5(this, b4));
                        this.c0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: td5
                            public final /* synthetic */ wd5 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                byte b42 = b4;
                                wd5 wd5Var = this.b;
                                wd5Var.getClass();
                                switch (b42) {
                                    case 0:
                                        wd5Var.d0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        wd5Var.invalidate();
                                        break;
                                    default:
                                        wd5Var.d0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        wd5Var.invalidate();
                                        break;
                                }
                            }
                        });
                        this.c0.start();
                        return;
                    }
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.e;
        if (!z) {
            if (i == arrayList3.size() && arrayList4.contains(obj)) {
                int indexOf = arrayList4.indexOf(obj);
                int i11 = this.f;
                if (i11 != indexOf && indexOf != -1) {
                    boolean z5 = this.J;
                    if (!z5 && !this.I && (indexOf == i11 - 1 || indexOf == i11 + 1)) {
                        this.N = true;
                        z5 = true;
                    }
                    int i12 = this.w;
                    int i13 = this.n;
                    if (z5) {
                        this.M = indexOf;
                        this.G = indexOf;
                        this.K = (i13 + i12) * (i11 - indexOf);
                        this.I = true;
                        this.J = false;
                        this.H = System.currentTimeMillis();
                        invalidate();
                        z2 = false;
                    } else {
                        z2 = false;
                        a((i13 + i12) * (i11 - indexOf), true);
                        this.f = indexOf;
                        this.I = false;
                    }
                    this.x = z2 ? 1 : 0;
                }
            } else {
                z2 = false;
                z = true;
            }
            if (z) {
                return;
            }
            int size3 = arrayList3.size();
            this.J = z2;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f = i5;
                this.M = -1;
                this.N = z2;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i14 = i5;
                if (all != null && !all.isEmpty() && this.h != j) {
                    int size4 = all.size();
                    for (int i15 = i14; i15 < size4; i15++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i15);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(jn5.f(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i16 = 0;
                    this.f = 0;
                    this.M = -1;
                    this.N = false;
                    int i17 = i14 - 1;
                    while (i17 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i17);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i16, pageBlock5);
                        arrayList3.add(i16, jn5.f(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i17--;
                        i16 = 0;
                    }
                }
            } else {
                ed8 ed8Var2 = ((jb8) this.a0).a.d;
                boolean z6 = ed8Var2 != null && ed8Var2.K() && arrayList2.size() > 1;
                if (this.h != j || z6 || i6 != 0) {
                    int min2 = Math.min(i5 + 10, arrayList2.size());
                    int i18 = i5;
                    while (true) {
                        if (i18 >= min2) {
                            i4 = i5;
                            break;
                        }
                        r47 r47Var4 = (r47) arrayList2.get(i18);
                        if (i6 == 0 && !z6) {
                            i4 = i5;
                            if (r47Var4.d1() != this.h) {
                                break;
                            }
                        } else {
                            i4 = i5;
                        }
                        arrayList4.add(r47Var4);
                        arrayList3.add(jn5.f(xb4.w(r47Var4.p0, 56, true, null, false), r47Var4.n0));
                        i18++;
                        i5 = i4;
                    }
                    this.f = 0;
                    this.M = -1;
                    this.N = false;
                    int max2 = Math.max(i4 - 10, 0);
                    for (int i19 = i4 - 1; i19 >= max2; i19--) {
                        r47 r47Var5 = (r47) arrayList2.get(i19);
                        if (i6 == 0 && !z6 && r47Var5.d1() != this.h) {
                            break;
                        }
                        arrayList4.add(0, r47Var5);
                        arrayList3.add(0, jn5.f(xb4.w(r47Var5.p0, 56, true, null, false), r47Var5.n0));
                        this.f++;
                    }
                }
            }
            if (arrayList3.size() == 1) {
                arrayList3.clear();
                arrayList4.clear();
            }
            if (arrayList3.size() != size3) {
                requestLayout();
            }
            a(0, false);
            return;
        }
        z2 = false;
        if (z) {
        }
    }

    public final boolean c() {
        if (!this.V || this.c0 != null) {
            return false;
        }
        if (this.d0 > 0.0f || !this.W) {
            return true;
        }
        ValueAnimator valueAnimator = this.b0;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void d() {
        this.V = false;
        if (this.T) {
            this.d0 = 0.0f;
        }
    }

    public final void e() {
        this.Q = false;
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i = this.U;
        if (i >= 0 && i < this.e.size()) {
            this.R = true;
            this.N = false;
            int i2 = this.U;
            this.M = i2;
            this.G = i2;
            this.K = (this.n + this.w) * (this.f - i2);
            this.L = this.x;
            this.y = 1.0f;
            this.U = -1;
            vd5 vd5Var = this.a0;
            if (vd5Var != null) {
                PhotoViewer photoViewer = ((jb8) vd5Var).a;
                if (PhotoViewer.a2(photoViewer.S4)) {
                    photoViewer.Y2 = true;
                    photoViewer.Y0(true);
                    photoViewer.v(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i;
        int i2;
        int i3;
        int i4 = this.x;
        int abs = Math.abs(i4);
        int i5 = this.n;
        int i6 = this.w;
        int i7 = (i5 / 2) + i6;
        int i8 = -1;
        if (abs > i7) {
            if (i4 > 0) {
                i2 = i4 - i7;
                i3 = 1;
            } else {
                i2 = i4 + i7;
                i3 = -1;
            }
            i = (i2 / (i5 + (i6 << 1))) + i3;
        } else {
            i = 0;
        }
        this.U = this.f - i;
        PhotoViewer photoViewer = ((jb8) this.a0).a;
        int i9 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        bd8 bd8Var = photoViewer.i7;
        List all = bd8Var != null ? bd8Var.getAll() : null;
        int i10 = this.U;
        if (i9 != i10 && i10 >= 0 && i10 < this.d.size()) {
            Object obj = this.e.get(this.U);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i8 = arrayList2.indexOf((r47) obj);
            } else if (all != null && !all.isEmpty()) {
                i8 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i8 = arrayList.indexOf((jn5) obj);
            }
            if (i8 >= 0) {
                this.S = true;
                ((jb8) this.a0).a(i8);
            }
        }
        if (!this.Q) {
            this.Q = true;
            this.R = false;
        }
        a(this.x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.M = -1;
        this.N = false;
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z = this.V;
        ArrayList arrayList = this.c;
        if (z || !arrayList.isEmpty()) {
            float f2 = this.d0;
            if (!this.W) {
                f2 = this.V ? 1.0f : 0.0f;
            }
            Paint paint = this.a;
            paint.setAlpha((int) (f2 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i2 = this.x;
            int i3 = this.n;
            float f3 = i3;
            int i4 = (int) (f3 * 2.0f);
            int L = hl.L(8.0f);
            int i5 = this.f;
            ArrayList arrayList2 = this.d;
            jn5 jn5Var = (jn5) arrayList2.get(i5);
            int i6 = this.r;
            int min = Math.min(i4, (jn5Var == null || (photoSize2 = jn5Var.k) == null) ? i6 : Math.max(i3, (int) ((i6 / photoSize2.h) * photoSize2.w)));
            float f4 = L << 1;
            float f5 = this.E;
            int i7 = ((int) ((min - i3) * f5)) + i3 + ((int) (f4 * f5));
            int i8 = this.G;
            if (i8 < 0 || i8 >= arrayList2.size()) {
                i6 = i3;
            } else {
                jn5 jn5Var2 = (jn5) arrayList2.get(this.G);
                if (jn5Var2 != null && (photoSize = jn5Var2.k) != null) {
                    i6 = Math.max(i3, (int) ((i6 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i4, i6);
            float f6 = this.F;
            int i9 = (int) (((((min2 + r10) - i3) / 2) * f6 * (this.G > this.f ? -1 : 1)) + i2);
            int i10 = ((int) ((min2 - i3) * f6)) + i3 + ((int) (f4 * f6));
            int measuredWidth = (getMeasuredWidth() - i7) / 2;
            int i11 = 0;
            while (i11 < size) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i11);
                int i12 = imageReceiver.f;
                int i13 = this.f;
                if (i12 == i13) {
                    imageReceiver.L0 = (r8 / 2) + measuredWidth + i9;
                    imageReceiver.N0 = i7 - r8;
                    i = size;
                } else {
                    int i14 = this.G;
                    i = size;
                    int i15 = this.w;
                    if (i14 < i13) {
                        if (i12 < i13) {
                            int i16 = i12 - i13;
                            if (i12 <= i14) {
                                f = ((((i3 + i15) * (i16 + 1)) + measuredWidth) - (i15 + i10)) + i9;
                                imageReceiver.L0 = f;
                            } else {
                                f = ((i15 + i3) * i16) + measuredWidth + i9;
                                imageReceiver.L0 = f;
                            }
                        } else {
                            f = ((i15 + i3) * ((i12 - i13) - 1)) + measuredWidth + i7 + i15 + i9;
                            imageReceiver.L0 = f;
                        }
                    } else if (i12 < i13) {
                        f = ((i15 + i3) * (i12 - i13)) + measuredWidth + i9;
                        imageReceiver.L0 = f;
                    } else {
                        int i17 = measuredWidth + i7 + i15;
                        int i18 = i12 - i13;
                        if (i12 <= i14) {
                            f = ((i15 + i3) * (i18 - 1)) + i17 + i9;
                            imageReceiver.L0 = f;
                        } else {
                            f = i15 + i10 + ((i3 + i15) * (i18 - 2)) + i17 + i9;
                            imageReceiver.L0 = f;
                        }
                    }
                    if (i12 == i14) {
                        imageReceiver.N0 = i10 - r10;
                        imageReceiver.L0 = (int) (f + (r10 / 2));
                    } else {
                        imageReceiver.N0 = f3;
                    }
                }
                imageReceiver.setAlpha(this.d0);
                imageReceiver.q0(hl.L(2.0f));
                imageReceiver.h(canvas, null);
                i11++;
                size = i;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.H;
            if (j > 17) {
                j = 17;
            }
            this.H = currentTimeMillis;
            int i19 = this.M;
            if (i19 >= 0) {
                float f7 = this.y;
                if (f7 > 0.0f) {
                    float f8 = j;
                    float f9 = f7 - (f8 / (this.N ? 100.0f : 200.0f));
                    this.y = f9;
                    if (i19 == this.f) {
                        float f10 = this.E;
                        if (f10 < 1.0f) {
                            f10 += f8 / 200.0f;
                            this.E = f10;
                            if (f10 > 1.0f) {
                                this.E = 1.0f;
                                f10 = 1.0f;
                            }
                        }
                        this.x = this.L + ((int) Math.ceil(f10 * (this.K - r5)));
                    } else {
                        k43 k43Var = k43.g;
                        this.F = k43Var.getInterpolation(1.0f - f9);
                        if (this.R) {
                            float f11 = this.E;
                            if (f11 > 0.0f) {
                                float f12 = f11 - (f8 / 200.0f);
                                this.E = f12;
                                if (f12 < 0.0f) {
                                    this.E = 0.0f;
                                }
                            }
                            this.x = this.L + ((int) Math.ceil(r5 * (this.K - r1)));
                        } else {
                            this.E = k43Var.getInterpolation(this.y);
                            this.x = (int) Math.ceil(this.F * this.K);
                        }
                    }
                    if (this.y <= 0.0f) {
                        this.f = this.M;
                        this.y = 1.0f;
                        this.E = 1.0f;
                        this.F = 0.0f;
                        this.I = false;
                        this.R = false;
                        this.x = 0;
                        this.M = -1;
                        this.N = false;
                    }
                }
                a(this.x, true);
                invalidate();
            }
            if (this.Q) {
                float f13 = this.E;
                if (f13 > 0.0f) {
                    float f14 = f13 - (j / 200.0f);
                    this.E = f14;
                    if (f14 < 0.0f) {
                        this.E = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.O;
            if (scroller.isFinished()) {
                return;
            }
            if (scroller.computeScrollOffset()) {
                this.x = scroller.getCurrX();
                f();
                invalidate();
            }
            if (scroller.isFinished()) {
                e();
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Scroller scroller = this.O;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.x, 0, Math.round(f), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.x = (int) (this.x - f);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i = this.x;
        if (i < minScrollX) {
            this.x = minScrollX;
        } else if (i > maxScrollX) {
            this.x = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((jb8) this.a0).a;
        int i = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        bd8 bd8Var = photoViewer.i7;
        List all = bd8Var != null ? bd8Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i2);
            if (imageReceiver.H(motionEvent.getX(), motionEvent.getY())) {
                int i3 = imageReceiver.f;
                if (i3 >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (i3 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((r47) arrayList4.get(i3));
                            if (i != indexOf) {
                                this.y = 1.0f;
                                this.J = true;
                                ((jb8) this.a0).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(i3));
                            if (i != indexOf2) {
                                this.y = 1.0f;
                                this.J = true;
                                ((jb8) this.a0).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((jn5) arrayList4.get(i3));
                            if (i != indexOf3) {
                                this.y = 1.0f;
                                this.J = true;
                                ((jb8) this.a0).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i2++;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            r1 = this.P.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.Q && motionEvent.getAction() == 1 && this.O.isFinished()) {
                e();
            }
        }
        return r1;
    }

    public void setAnimateBackground(boolean z) {
        this.W = z;
    }

    public void setAnimationsEnabled(boolean z) {
        if (this.T != z) {
            this.T = z;
            if (z) {
                return;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.b0 = null;
            }
            ValueAnimator valueAnimator2 = this.c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.c0 = null;
            }
            this.d0 = 0.0f;
            invalidate();
        }
    }

    public void setDelegate(vd5 vd5Var) {
        this.a0 = vd5Var;
    }

    public void setMoveProgress(float f) {
        int i;
        float f2;
        if (this.Q || this.M >= 0) {
            return;
        }
        int i2 = this.f;
        if (f > 0.0f) {
            i = i2 - 1;
            this.G = i;
        } else {
            i = i2 + 1;
            this.G = i;
        }
        ArrayList arrayList = this.d;
        if (i < 0 || i >= arrayList.size()) {
            this.E = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = 1.0f - Math.abs(f);
            this.E = f2;
        }
        this.F = 1.0f - f2;
        this.I = f != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f >= 0.0f || this.f != arrayList.size() - 1) {
            if (f <= 0.0f || this.f != 0) {
                int i3 = (int) (f * (this.n + this.w));
                this.x = i3;
                a(i3, true);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
