// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w85 extends ViewGroup {
    public final u85 E;
    public float F;
    public long G;
    public long H;
    public int[] I;
    public final ez3 J;
    public final /* synthetic */ a95 K;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final TextView d;
    public final ImageView e;
    public final f91 f;
    public final int h;
    public float n;
    public float r;
    public ValueAnimator s;
    public boolean w;
    public long x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w85(a95 a95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.K = a95Var;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.h = gl.L(2.0f);
        this.r = 1.0f;
        this.E = new u85(this, (byte) 1);
        this.J = new ez3(this, (byte) 12);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.n = a95Var.c;
        ImageView imageView = new ImageView(launchActivity);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(bkb.K(gl.L(28.0f), 1711276032));
        addView(imageView);
        TextView textView = new TextView(launchActivity);
        this.d = textView;
        textView.setTextColor(-1275068417);
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setGravity(1);
        textView.setShadowLayer(gl.L(2.0f), 0.0f, 0.0f, TLObject.FLAG_31);
        textView.setVisibility(8);
        addView(textView);
        f91 f91Var = new f91(launchActivity);
        this.f = f91Var;
        addView(f91Var);
    }

    public final void a() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z85 z85Var = (z85) obj;
            z85Var.b();
            removeView(z85Var);
        }
        arrayList.clear();
        this.I = null;
    }

    public final boolean b() {
        Activity W = gl.W(getContext());
        return W != null && gl.F1(W) && SystemClock.elapsedRealtime() - this.x > 1000;
    }

    public final void c(z85 z85Var, int i, int i2) {
        float[] fArr = z85Var.P;
        float f = this.r;
        for (int i3 = 0; i3 < 4; i3++) {
            float f2 = z85Var.N[i3];
            fArr[i3] = tb4.A(z85Var.O[i3], f2, f, f2);
        }
        float f3 = this.h / 2.0f;
        float f4 = fArr[0];
        float f5 = i;
        int round = Math.round((f4 * f5) + (f4 > 0.001f ? f3 : 0.0f));
        float f6 = fArr[1];
        float f7 = i2;
        int round2 = Math.round((f6 * f7) + (f6 > 0.001f ? f3 : 0.0f));
        float f8 = fArr[2];
        int round3 = Math.round((f5 * f8) - (f8 < 0.999f ? f3 : 0.0f));
        float f9 = fArr[3];
        float f10 = f7 * f9;
        if (f9 >= 0.999f) {
            f3 = 0.0f;
        }
        int round4 = Math.round(f10 - f3);
        int max = Math.max(1, round3 - round);
        int max2 = Math.max(1, round4 - round2);
        if (z85Var.getMeasuredWidth() != max || z85Var.getMeasuredHeight() != max2 || z85Var.isLayoutRequested()) {
            z85Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(max2, TLObject.FLAG_30));
        }
        z85Var.layout(round, round2, max + round, max2 + round2);
        float f11 = this.r;
        float f12 = z85Var.Q;
        float f13 = ((z85Var.R - f12) * f11) + f12;
        z85Var.setAlpha(f13);
        float f14 = (f13 * 0.2f) + 0.8f;
        z85Var.setScaleX(f14);
        z85Var.setScaleY(f14);
    }

    public final void d() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            c((z85) obj, width, height);
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            c((z85) obj2, width, height);
        }
        invalidate();
    }

    public final boolean e(int i, int i2) {
        return Math.abs(Math.log((double) ((((float) i) / ((float) i2)) / this.n))) < 0.06d;
    }

    public final void f(boolean z) {
        boolean z2;
        int i;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            z85 z85Var = (z85) arrayList.get(i2);
            float f = z85Var.K;
            fArr[i2] = f;
            gc2 gc2Var = z85Var.b;
            fArr2[i2] = (gc2Var == null || !gc2Var.b) ? 1.0f : 2.0f;
            boolean z4 = z85Var.M;
            iArr[i2] = z4 ? i2 : -1;
            z3 |= z4 && z85Var.L <= 0.0f && f > 0.0f;
        }
        we7 a = dpe.a(fArr, fArr2, 0.45f, 2.35f, iArr, z3 ? 0.0f : this.n);
        int width = getWidth();
        int height = getHeight();
        float f2 = 0.001f;
        if (Math.abs(a.a - this.n) > 0.001f || width <= 0 || height <= 0 || e(width, height) || !b()) {
            z2 = false;
        } else {
            float f3 = width / height;
            a = dpe.a(fArr, fArr2, f3, f3, iArr, 0.0f);
            z2 = true;
        }
        this.F = a.a;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("group call pip: mosaic ");
            sb.append(Arrays.toString(fArr));
            sb.append(z2 ? " in the window" : "");
            sb.append(" -> ");
            sb.append(a);
            fa4.b(sb.toString());
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (true) {
            i = 4;
            if (i3 >= size2) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            z85 z85Var2 = (z85) obj;
            float f4 = this.r;
            float f5 = f2;
            float[] fArr3 = z85Var2.N;
            for (int i4 = 0; i4 < 4; i4++) {
                float f6 = fArr3[i4];
                fArr3[i4] = tb4.A(z85Var2.O[i4], f6, f4, f6);
            }
            float f7 = z85Var2.Q;
            z85Var2.Q = tb4.A(z85Var2.R, f7, f4, f7);
            f2 = f5;
        }
        float f8 = f2;
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            z85 z85Var3 = (z85) obj2;
            float f9 = this.r;
            float[] fArr4 = z85Var3.N;
            float[] fArr5 = z85Var3.O;
            int i6 = 0;
            while (i6 < i) {
                float f10 = fArr4[i6];
                fArr4[i6] = tb4.A(fArr5[i6], f10, f9, f10);
                i6++;
                i = 4;
            }
            float f11 = z85Var3.Q;
            z85Var3.Q = tb4.A(z85Var3.R, f11, f9, f11);
            System.arraycopy(z85Var3.N, 0, fArr5, 0, 4);
            z85Var3.R = 0.0f;
            i = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            z85 z85Var4 = (z85) arrayList.get(i7);
            System.arraycopy(a.b, i7 << 2, z85Var4.O, 0, 4);
            z85Var4.R = 1.0f;
            z85Var4.L = fArr[i7];
            if (!z85Var4.M || !z) {
                System.arraycopy(z85Var4.O, 0, z85Var4.N, 0, 4);
                z85Var4.Q = z ? 0.0f : 1.0f;
                z85Var4.M = true;
            }
        }
        for (int i8 : a.c) {
            arrayList3.add((z85) arrayList.get(i8));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.I = null;
        boolean z5 = !z2 && Math.abs(a.a - this.n) > f8;
        if (z5) {
            this.n = a.a;
            xa8 xa8Var = this.K.a;
            if (xa8Var != null) {
                xa8Var.d();
            }
        }
        j();
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
            this.s = null;
        }
        this.y = false;
        u85 u85Var = this.E;
        gl.r(u85Var);
        if (z) {
            this.r = 0.0f;
            if (!z5 || getWidth() <= 0 || getHeight() <= 0 || e(getWidth(), getHeight())) {
                g();
            } else {
                this.y = true;
                gl.d3(u85Var, 500L);
            }
        } else {
            this.r = 1.0f;
            a();
        }
        d();
    }

    public final void g() {
        byte b = 0;
        this.y = false;
        gl.r(this.E);
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.setDuration(420L);
        this.s.setInterpolator(s33.h);
        this.s.addUpdateListener(new ni4(this, (byte) 7));
        this.s.addListener(new v85(this, b));
        this.s.start();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int[] iArr = this.I;
        if (iArr == null || iArr.length != i) {
            iArr = new int[i];
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                int indexOfChild = indexOfChild((z85) obj);
                if (indexOfChild >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild;
                    i3++;
                }
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                int indexOfChild2 = indexOfChild((z85) obj2);
                if (indexOfChild2 >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild2;
                    i3++;
                }
            }
            ArrayList arrayList3 = this.a;
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                int indexOfChild3 = indexOfChild((z85) obj3);
                if (indexOfChild3 >= 0 && i3 < i) {
                    iArr[i3] = indexOfChild3;
                    i3++;
                }
            }
            for (int i7 = 0; i7 < i && i3 < i; i7++) {
                if (!(getChildAt(i7) instanceof z85)) {
                    iArr[i3] = i7;
                    i3++;
                }
            }
            if (i3 != i) {
                for (int i8 = 0; i8 < i; i8++) {
                    iArr[i8] = i8;
                }
            }
            this.I = iArr;
        }
        return iArr[i2];
    }

    public final void h() {
        if (this.w) {
            int i = 0;
            this.w = false;
            gl.r(this.J);
            this.f.b();
            this.y = false;
            gl.r(this.E);
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.s.cancel();
                this.s = null;
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                z85 z85Var = (z85) obj;
                z85Var.b();
                removeView(z85Var);
            }
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                z85 z85Var2 = (z85) obj2;
                z85Var2.b();
                removeView(z85Var2);
            }
            ArrayList arrayList3 = this.c;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                z85 z85Var3 = (z85) obj3;
                z85Var3.b();
                removeView(z85Var3);
            }
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
            this.r = 1.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030a A[EDGE_INSN: B:146:0x030a->B:147:0x030a BREAK  A[LOOP:7: B:130:0x02da->B:141:0x0305], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217 A[EDGE_INSN: B:72:0x0217->B:73:0x0217 BREAK  A[LOOP:3: B:62:0x01dc->B:69:0x0214], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        VoIPService voIPService;
        z85 z85Var;
        z85 z85Var2;
        VoIPService voIPService2;
        int i;
        long j;
        int size;
        boolean z2;
        int i2;
        int i3;
        long j2;
        long j3;
        int i4;
        vf6 vf6Var;
        long j4;
        int i5;
        int size2;
        int i6;
        int i7;
        boolean z3;
        long B1;
        boolean z4;
        String str;
        TLRPC.Chat chat;
        gc2 gc2Var;
        long j5;
        float f;
        boolean z5;
        boolean z6;
        if (this.w) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            fc2 fc2Var = sharedInstance2 != null ? sharedInstance2.groupCall : null;
            if (sharedInstance == null || fc2Var == null) {
                return;
            }
            long selfId = sharedInstance.getSelfId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TextView textView = this.d;
            this.e.setImageResource(sharedInstance.isMicMute() ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
            this.f.c();
            long c = b91.c();
            if (c != this.H) {
                this.H = c;
                xa8 xa8Var = this.K.a;
                if (xa8Var != null) {
                    xa8Var.d();
                }
            }
            int callState = sharedInstance.getCallState();
            if (callState == 5) {
                textView.setText(k96.M0(2131743011, null));
                textView.setVisibility(0);
            } else if (callState != 3) {
                textView.setText(k96.M0(2131743177, null));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList a = a95.a(selfId, fc2Var);
            int size3 = a.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj = a.get(i8);
                i8++;
                gc2 gc2Var2 = (gc2) obj;
                boolean z7 = gc2Var2.b;
                TLRPC.GroupCallParticipant groupCallParticipant = gc2Var2.a;
                linkedHashMap.put(z7 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, gc2Var2);
            }
            boolean isEmpty = linkedHashMap.isEmpty();
            boolean z8 = true;
            int size4 = this.a.size() - 1;
            boolean z9 = false;
            while (size4 >= 0) {
                z85 z85Var3 = (z85) this.a.get(size4);
                aic aicVar = z85Var3.c;
                if (!isEmpty ? aicVar == null || linkedHashMap.containsKey(z85Var3.a) : aicVar == null) {
                    z6 = z8;
                } else {
                    this.a.remove(size4);
                    z85Var3.getClass();
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    TLRPC.GroupCallParticipant groupCallParticipant2 = z85Var3.n;
                    if (groupCallParticipant2 == null || sharedInstance3 == null) {
                        z6 = z8;
                    } else {
                        z6 = z8;
                        sharedInstance3.removeExtraRemoteSink(groupCallParticipant2, z85Var3.r, z85Var3.U);
                    }
                    z85Var3.n = null;
                    this.b.add(z85Var3);
                    z9 = z6;
                }
                size4--;
                z8 = z6;
            }
            boolean z10 = z8;
            for (int size5 = this.c.size() - 1; size5 >= 0; size5--) {
                z85 z85Var4 = (z85) this.c.get(size5);
                if (!linkedHashMap.containsKey(z85Var4.a)) {
                    this.c.remove(size5);
                    z85Var4.b();
                    removeView(z85Var4);
                    this.I = null;
                }
            }
            if (!isEmpty) {
                for (gc2 gc2Var3 : linkedHashMap.values()) {
                    boolean z11 = gc2Var3.b;
                    TLRPC.GroupCallParticipant groupCallParticipant3 = gc2Var3.a;
                    String str2 = z11 ? groupCallParticipant3.presentationEndpoint : groupCallParticipant3.videoEndpoint;
                    ArrayList arrayList = this.a;
                    int size6 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size6) {
                            voIPService = sharedInstance;
                            z85Var = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        z85Var = (z85) obj2;
                        voIPService = sharedInstance;
                        if (TextUtils.equals(z85Var.a, str2)) {
                            break;
                        } else {
                            sharedInstance = voIPService;
                        }
                    }
                    if (z85Var == null) {
                        ArrayList arrayList2 = this.c;
                        int size7 = arrayList2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size7) {
                                z85Var2 = null;
                                break;
                            }
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            z85Var2 = (z85) obj3;
                            if (TextUtils.equals(z85Var2.a, str2)) {
                                break;
                            }
                        }
                        z85Var = z85Var2;
                    }
                    if (z85Var == null) {
                        z85 z85Var5 = new z85(this.K, getContext(), str2, gc2Var3);
                        if (z) {
                            this.a.add(z85Var5);
                            addView(z85Var5);
                            z9 = z10;
                        } else {
                            z85Var5.y = elapsedRealtime;
                            z85Var5.setAlpha(0.0f);
                            this.c.add(z85Var5);
                            addView(z85Var5);
                        }
                    } else {
                        z85Var.b = gc2Var3;
                    }
                    sharedInstance = voIPService;
                }
            } else if (this.a.isEmpty()) {
                z85 z85Var6 = new z85(this.K, getContext(), "avatar", null);
                this.a.add(z85Var6);
                addView(z85Var6);
                voIPService2 = sharedInstance;
                z9 = z10;
                i = 0;
                while (true) {
                    j = 2000;
                    if (i < this.c.size()) {
                        break;
                    }
                    z85 z85Var7 = (z85) this.c.get(i);
                    z85Var7.d(false);
                    if (z85Var7.K > 0.0f || elapsedRealtime - z85Var7.y >= 2000) {
                        this.c.remove(i);
                        this.a.add(z85Var7);
                        this.I = null;
                        i--;
                        z9 = z10;
                    }
                    i++;
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = this.a;
                    int size8 = arrayList3.size();
                    boolean z12 = false;
                    int i11 = 0;
                    while (i11 < size8) {
                        Object obj4 = arrayList3.get(i11);
                        i11++;
                        z12 |= !(((z85) obj4).c == null ? z10 : false);
                    }
                    for (int size9 = this.a.size() - 1; size9 >= 0 && z12; size9--) {
                        z85 z85Var8 = (z85) this.a.get(size9);
                        if (z85Var8.c == null) {
                            this.a.remove(size9);
                            this.b.add(z85Var8);
                            z9 = z10;
                        }
                    }
                }
                ArrayList arrayList4 = this.a;
                size = arrayList4.size();
                z2 = false;
                boolean z13 = false;
                i2 = 0;
                while (i2 < size) {
                    Object obj5 = arrayList4.get(i2);
                    i2++;
                    z85 z85Var9 = (z85) obj5;
                    long j6 = j;
                    z85Var9.d(z10);
                    boolean z14 = z85Var9.L > 0.0f;
                    ArrayList arrayList5 = arrayList4;
                    float f2 = z85Var9.K;
                    if (f2 > 0.0f) {
                        f = f2;
                        z5 = true;
                    } else {
                        f = f2;
                        z5 = false;
                    }
                    if (z14 != z5 || (z5 && Math.abs(Math.log(f / r10)) > 0.10000000149011612d)) {
                        z2 = true;
                    }
                    if (!z5 && z85Var9.c != null && elapsedRealtime - z85Var9.E < j6) {
                        z13 = true;
                    }
                    j = j6;
                    arrayList4 = arrayList5;
                    z10 = true;
                }
                if (z2 && !z13) {
                    z9 = true;
                }
                if (!z9 || z) {
                    i3 = 1;
                    f(!z);
                } else {
                    i3 = 1;
                }
                j2 = 0;
                j3 = 0;
                long j7 = 0;
                i4 = 0;
                while (true) {
                    vf6Var = fc2Var.P;
                    if (i4 < vf6Var.m()) {
                        break;
                    }
                    TLRPC.GroupCallParticipant groupCallParticipant4 = (TLRPC.GroupCallParticipant) vf6Var.n(i4);
                    long j8 = vf6Var.j(i4);
                    if (groupCallParticipant4 == null || j8 == selfId) {
                        j5 = j2;
                    } else {
                        j5 = j2;
                        if (j3 == j2 || groupCallParticipant4.lastSpeakTime > j7) {
                            j7 = groupCallParticipant4.lastSpeakTime;
                            j3 = j8;
                        }
                    }
                    i4++;
                    j2 = j5;
                }
                j4 = j2;
                if (j3 == j4) {
                    this.G = j3;
                } else if (!isEmpty && !this.a.isEmpty()) {
                    i5 = 0;
                    if (((z85) this.a.get(0)).b != null) {
                        this.G = k27.B1(((z85) this.a.get(0)).b.a.peer);
                    }
                    if (j3 == j4) {
                        long j9 = this.G;
                        if (j9 != j4 && fc2Var.d.f(j9) != null) {
                            j3 = this.G;
                        } else if (voIPService2.getChat() != null) {
                            j3 = -voIPService2.getChat().id;
                        } else {
                            int i12 = i5;
                            while (true) {
                                if (i12 >= fc2Var.e.size()) {
                                    break;
                                }
                                long B12 = k27.B1(((TLRPC.GroupCallParticipant) fc2Var.e.get(i12)).peer);
                                if (B12 != selfId) {
                                    selfId = B12;
                                    break;
                                }
                                i12++;
                            }
                            j3 = selfId;
                        }
                    }
                    ArrayList arrayList6 = this.a;
                    size2 = arrayList6.size();
                    i6 = i5;
                    while (i6 < size2) {
                        Object obj6 = arrayList6.get(i6);
                        i6++;
                        z85 z85Var10 = (z85) obj6;
                        if (z85Var10.n == null) {
                            z85Var10.c();
                        }
                        aic aicVar2 = z85Var10.c;
                        int i13 = (aicVar2 == null || z85Var10.n == null || !aicVar2.d.isFirstFrameRendered() || elapsedRealtime - z85Var10.s >= 1500) ? i5 : i3;
                        aic aicVar3 = z85Var10.c;
                        if (aicVar3 != null && z85Var10.n != null && !aicVar3.d.isFirstFrameRendered() && (gc2Var = z85Var10.b) != null) {
                            boolean z15 = gc2Var.b;
                            TLRPC.GroupCallParticipant groupCallParticipant5 = gc2Var.a;
                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = z15 ? groupCallParticipant5.presentation : groupCallParticipant5.video;
                            if (tL_groupCallParticipantVideo != null && !tL_groupCallParticipantVideo.paused && elapsedRealtime - z85Var10.E < 1200) {
                                i7 = i3;
                                z3 = (i13 == 0 || i7 != 0) ? i3 : i5;
                                if (z85Var10.F != z3) {
                                    z85Var10.F = z3;
                                    z85Var10.d.setVisibility(z3 != 0 ? 8 : i5);
                                    if (w01.a && z85Var10.c != null) {
                                        long elapsedRealtime2 = z85Var10.s == j4 ? -1L : SystemClock.elapsedRealtime() - z85Var10.s;
                                        StringBuilder sb = new StringBuilder("group call pip: ");
                                        sb.append(z85Var10.a);
                                        sb.append(z3 != 0 ? " video" : " avatar");
                                        sb.append(", last frame ");
                                        sb.append(elapsedRealtime2);
                                        sb.append(" ms ago, subscribed ");
                                        sb.append(z85Var10.n != null ? i3 : i5);
                                        sb.append(", rendered ");
                                        sb.append(z85Var10.c.d.isFirstFrameRendered());
                                        fa4.b(sb.toString());
                                    }
                                    z85Var10.invalidate();
                                }
                                gc2 gc2Var4 = z85Var10.b;
                                B1 = gc2Var4 == null ? k27.B1(gc2Var4.a.peer) : j3;
                                if (B1 != z85Var10.G) {
                                    z85Var10.G = B1;
                                    na7 q1 = na7.q1(voIPService2.getAccount());
                                    if (cf3.D(B1)) {
                                        TLRPC.User V1 = q1.V1(Long.valueOf(B1));
                                        str = l7c.r(V1);
                                        chat = V1;
                                    } else {
                                        TLRPC.Chat K0 = q1.K0(Long.valueOf(-B1));
                                        if (K0 != null) {
                                            str = K0.title;
                                            chat = K0;
                                        } else {
                                            str = "";
                                            chat = K0;
                                        }
                                    }
                                    z85Var10.d.a(chat);
                                    z85Var10.e.setText(str);
                                }
                                TLRPC.GroupCallParticipant groupCallParticipant6 = (TLRPC.GroupCallParticipant) fc2Var.d.f(B1);
                                z4 = (groupCallParticipant6 != null || fc2Var.P.g(null, B1) == null) ? i5 : i3;
                                c91 c91Var = z85Var10.d;
                                float f3 = z4 == 0 ? groupCallParticipant6.amplitude : 0.0f;
                                c91Var.w = z4;
                                c91Var.r = Math.min(1.0f, Math.max(0.0f, (f3 * 15.0f) / 80.0f));
                                c91Var.invalidate();
                                if (z85Var10.H == z4) {
                                    z85Var10.H = z4;
                                    z85Var10.invalidate();
                                }
                            }
                        }
                        i7 = i5;
                        if (i13 == 0) {
                        }
                        if (z85Var10.F != z3) {
                        }
                        gc2 gc2Var42 = z85Var10.b;
                        if (gc2Var42 == null) {
                        }
                        if (B1 != z85Var10.G) {
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant62 = (TLRPC.GroupCallParticipant) fc2Var.d.f(B1);
                        if (groupCallParticipant62 != null) {
                        }
                        c91 c91Var2 = z85Var10.d;
                        if (z4 == 0) {
                        }
                        c91Var2.w = z4;
                        c91Var2.r = Math.min(1.0f, Math.max(0.0f, (f3 * 15.0f) / 80.0f));
                        c91Var2.invalidate();
                        if (z85Var10.H == z4) {
                        }
                    }
                }
                i5 = 0;
                if (j3 == j4) {
                }
                ArrayList arrayList62 = this.a;
                size2 = arrayList62.size();
                i6 = i5;
                while (i6 < size2) {
                }
            }
            voIPService2 = sharedInstance;
            i = 0;
            while (true) {
                j = 2000;
                if (i < this.c.size()) {
                }
                i++;
            }
            if (!isEmpty) {
            }
            ArrayList arrayList42 = this.a;
            size = arrayList42.size();
            z2 = false;
            boolean z132 = false;
            i2 = 0;
            while (i2 < size) {
            }
            if (z2) {
                z9 = true;
            }
            if (z9) {
            }
            i3 = 1;
            f(!z);
            j2 = 0;
            j3 = 0;
            long j72 = 0;
            i4 = 0;
            while (true) {
                vf6Var = fc2Var.P;
                if (i4 < vf6Var.m()) {
                }
                i4++;
                j2 = j5;
            }
            j4 = j2;
            if (j3 == j4) {
            }
            i5 = 0;
            if (j3 == j4) {
            }
            ArrayList arrayList622 = this.a;
            size2 = arrayList622.size();
            i6 = i5;
            while (i6 < size2) {
            }
        }
    }

    public final void j() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z85 z85Var = (z85) obj;
            float[] fArr = z85Var.O;
            int round = Math.round((fArr[2] - fArr[0]) * width);
            float[] fArr2 = z85Var.O;
            int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
            int max = Math.max(1, round);
            int max2 = Math.max(1, round2);
            float f = z85Var.K;
            if (f > 0.0f) {
                float f2 = max;
                float f3 = max2;
                if (f2 / f3 > f) {
                    max2 = Math.round(f2 / f);
                } else {
                    max = Math.round(f3 * f);
                }
            }
            if (max != z85Var.S || max2 != z85Var.T) {
                z85Var.S = max;
                z85Var.T = max2;
                z85Var.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = gl.L(6.0f);
        int L2 = gl.L(6.0f);
        int L3 = gl.L(6.0f);
        ImageView imageView = this.e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + gl.L(6.0f));
        int i5 = i3 - i;
        TextView textView = this.d;
        int measuredWidth = (i5 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, gl.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + gl.L(8.0f));
        this.f.layout(0, 0, i5, i4 - i2);
        d();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.e.measure(View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), TLObject.FLAG_30));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gl.L(64.0f)), TLObject.FLAG_30), 0);
        this.f.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j();
        if (this.y && i > 0 && i2 > 0 && e(i, i2)) {
            post(this.E);
        } else {
            if (this.y) {
                return;
            }
            post(new u85(this, (byte) 0));
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.I = null;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I = null;
    }
}
