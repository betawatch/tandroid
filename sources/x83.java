// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class x83 extends d79 {
    public static final /* synthetic */ int x3 = 0;
    public boolean f3;
    public int g3;
    public final x46 h3;
    public final v83 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public w83[] o3;
    public w83[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public u83 v3;
    public final /* synthetic */ a93 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x83(a93 a93Var, Activity activity) {
        super(activity, null);
        vy4 vy4Var;
        this.w3 = a93Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        vy4Var = ((e) a93Var).glassEngine;
        vy4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        x46 x46Var = new x46();
        this.h3 = x46Var;
        setLayoutManager(x46Var);
        v83 v83Var = new v83(this, (byte) 0);
        this.i3 = v83Var;
        setAdapter(v83Var);
        s1();
        setOnItemClickListener(new u(this, (byte) 19));
        zb3 zb3Var = new zb3();
        zb3Var.n(220L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        setItemAnimator(zb3Var);
        eg0.g(this, a93Var.h, a93Var.n, hl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        a93 a93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((e) a93Var).currentAccount;
            return a2b.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((e) a93Var).currentAccount;
        long d = a2b.c(i3).d(0, i);
        i4 = ((e) a93Var).currentAccount;
        long d2 = a2b.c(i4).d(1, i) + d;
        i5 = ((e) a93Var).currentAccount;
        return a2b.c(i5).d(2, i) + d2;
    }

    public final long B1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        a93 a93Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((e) a93Var).currentAccount;
            return a2b.c(i).h[this.g3 - 1];
        }
        i2 = ((e) a93Var).currentAccount;
        long j = a2b.c(i2).h[0];
        i3 = ((e) a93Var).currentAccount;
        long j2 = a2b.c(i3).h[1];
        i4 = ((e) a93Var).currentAccount;
        long[] jArr = {j, j2, a2b.c(i4).h[2]};
        long j3 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < 3; i6++) {
            long j4 = jArr[i6];
            if (j3 > j4) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final long C1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        a93 a93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((e) a93Var).currentAccount;
            return a2b.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((e) a93Var).currentAccount;
        long e = a2b.c(i3).e(0, i);
        i4 = ((e) a93Var).currentAccount;
        long e2 = a2b.c(i4).e(1, i) + e;
        i5 = ((e) a93Var).currentAccount;
        return a2b.c(i5).e(2, i) + e2;
    }

    public final void D1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.r3 = A1(6) + C1(6);
        this.s3 = A1(6);
        this.t3 = C1(6);
        if (this.o3 == null) {
            this.o3 = new w83[7];
        }
        if (this.p3 == null) {
            this.p3 = new w83[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = a93.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 >= length) {
                Arrays.sort(this.o3, new f03((byte) 3));
                hl.a3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
            int i15 = iArr[i14];
            long A1 = A1(i15) + C1(i15);
            w83[] w83VarArr = this.p3;
            w83[] w83VarArr2 = this.o3;
            long A12 = A1(iArr[i14]);
            long C1 = C1(iArr[i14]);
            int i16 = iArr[i14];
            int i17 = this.g3;
            a93 a93Var = this.w3;
            if (i17 == 1 || i17 == 2) {
                i = 2;
            } else {
                i = 2;
                if (i17 != 3) {
                    i11 = ((e) a93Var).currentAccount;
                    int i18 = a2b.c(i11).f[0][i16];
                    i12 = ((e) a93Var).currentAccount;
                    int i19 = a2b.c(i12).f[1][i16] + i18;
                    i13 = ((e) a93Var).currentAccount;
                    i3 = a2b.c(i13).f[2][i16] + i19;
                    i4 = iArr[i14];
                    i5 = this.g3;
                    if (i5 != 1 || i5 == i || i5 == 3) {
                        i6 = ((e) a93Var).currentAccount;
                        i7 = a2b.c(i6).e[this.g3 - 1][i4];
                    } else {
                        i8 = ((e) a93Var).currentAccount;
                        int i20 = a2b.c(i8).e[0][i4];
                        i9 = ((e) a93Var).currentAccount;
                        int i21 = a2b.c(i9).e[1][i4] + i20;
                        i10 = ((e) a93Var).currentAccount;
                        i7 = a2b.c(i10).e[2][i4] + i21;
                    }
                    w83 w83Var = new w83();
                    w83Var.d = i14;
                    w83Var.c = A1;
                    w83Var.b = true;
                    w83Var.e = A12;
                    w83Var.g = i3;
                    w83Var.f = C1;
                    w83Var.h = i7;
                    w83VarArr2[i14] = w83Var;
                    w83VarArr[i14] = w83Var;
                    fArr[i14] = A1 / this.r3;
                    i14++;
                }
            }
            i2 = ((e) a93Var).currentAccount;
            i3 = a2b.c(i2).f[this.g3 - 1][i16];
            i4 = iArr[i14];
            i5 = this.g3;
            if (i5 != 1) {
            }
            i6 = ((e) a93Var).currentAccount;
            i7 = a2b.c(i6).e[this.g3 - 1][i4];
            w83 w83Var2 = new w83();
            w83Var2.d = i14;
            w83Var2.c = A1;
            w83Var2.b = true;
            w83Var2.e = A12;
            w83Var2.g = i3;
            w83Var2.f = C1;
            w83Var2.h = i7;
            w83VarArr2[i14] = w83Var2;
            w83VarArr[i14] = w83Var2;
            fArr[i14] = A1 / this.r3;
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(boolean z) {
        int i;
        String str;
        int i2;
        String M0;
        SpannableString spannableString;
        int i3;
        SpannableString spannableString2;
        char c;
        boolean z2;
        CharSequence concat;
        ArrayList arrayList = this.j3;
        arrayList.clear();
        ArrayList arrayList2 = this.k3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new s83(0, false));
        long j = 0;
        int i4 = 1;
        String a0 = this.r3 > 0 ? ob6.a0(null, null, 2131742439, ob6.D0().y0().format(B1())) : ob6.a0(null, null, 2131747920, ob6.D0().y0().format(B1()));
        arrayList2.add(new s83(1, a0));
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (true) {
            w83[] w83VarArr = this.o3;
            if (i5 >= w83VarArr.length) {
                break;
            }
            w83 w83Var = w83VarArr[i5];
            long j2 = j;
            long j3 = w83Var.c;
            int i6 = w83Var.d;
            if (this.u3) {
                c = 2;
            } else {
                c = 2;
                if (!this.n3.contains(Integer.valueOf(i6))) {
                    z2 = false;
                    if (j3 <= j2 || z2) {
                        int i7 = this.m3[i6];
                        SpannableString spannableString3 = new SpannableString(i7 > 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i7)));
                        spannableString3.setSpan(new y7c(hl.o()), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new r83(), 0, spannableString3.length(), 33);
                        int i8 = a93.w[i6];
                        int[] iArr = a93.r[i6];
                        int i9 = iArr[0];
                        int i10 = iArr[1];
                        if (j3 != j2) {
                            concat = ob6.M0(a93.x[i6], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = ob6.M0(a93.x[i6], null);
                            charSequenceArr[1] = "  ";
                            charSequenceArr[c] = spannableString3;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new s83(i5, i8, i9, i10, concat, hl.i0(j3, false, false)));
                    }
                    i5++;
                    j = j2;
                }
            }
            z2 = true;
            if (j3 <= j2) {
            }
            int i72 = this.m3[i6];
            SpannableString spannableString32 = new SpannableString(i72 > 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i72)));
            spannableString32.setSpan(new y7c(hl.o()), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new r83(), 0, spannableString32.length(), 33);
            int i82 = a93.w[i6];
            int[] iArr2 = a93.r[i6];
            int i92 = iArr2[0];
            int i102 = iArr2[1];
            if (j3 != j2) {
            }
            arrayList3.add(new s83(i5, i82, i92, i102, concat, hl.i0(j3, false, false)));
            i5++;
            j = j2;
        }
        long j4 = j;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i11 = aob.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            vnb vnbVar = this.o2;
            yob.x(this, mutate, i11, vnbVar, mode);
            mutate.setBounds(0, hl.L(2.0f), hl.L(16.0f), hl.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            yob.x(this, mutate2, i11, vnbVar, mode);
            mutate2.setBounds(0, hl.L(2.0f), hl.L(16.0f), hl.L(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                int i13 = ((s83) arrayList3.get(i12)).h;
                if (i13 < 0 || this.q3[i13]) {
                    spannableString = spannableString4;
                    i3 = i4;
                    spannableString2 = spannableString5;
                } else {
                    w83 w83Var2 = this.o3[i13];
                    int[] iArr3 = a93.y;
                    int i14 = w83Var2.d;
                    int i15 = w83Var2.g;
                    int i16 = w83Var2.h;
                    spannableString2 = spannableString5;
                    long j5 = w83Var2.f;
                    spannableString = spannableString4;
                    long j6 = w83Var2.e;
                    int i17 = iArr3[i14];
                    if (i17 == 0) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, s83.b(ob6.H(',', "OutgoingCallsCount", i16), hl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, s83.b(ob6.H(',', "IncomingCallsCount", i15), hl.i0(j6, false, false)));
                        }
                    } else if (i17 != 1) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, s83.b(TextUtils.concat(spannableString, " ", hl.S2(ob6.H(',', "FilesSentCount", i16))), hl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, s83.b(TextUtils.concat(spannableString2, " ", hl.S2(ob6.H(',', "FilesReceivedCount", i15))), hl.i0(j6, false, false)));
                        }
                    } else {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, s83.b(TextUtils.concat(spannableString, " ", ob6.M0(2131752632, null)), hl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            i3 = 1;
                            arrayList3.add(i12, s83.b(TextUtils.concat(spannableString2, " ", ob6.M0(2131752633, null)), hl.i0(j6, false, false)));
                        }
                    }
                    i3 = 1;
                }
                i12 += i3;
                spannableString5 = spannableString2;
                spannableString4 = spannableString;
                i4 = 1;
            }
            arrayList2.addAll(arrayList3);
            if (!this.u3) {
                arrayList2.add(new s83(3, ob6.M0(2131751640, null).concat("\n")));
            }
        }
        if (!this.u3) {
            arrayList2.add(new s83(4, ob6.M0(2131743626, null)));
            arrayList2.add(new s83(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, ob6.M0(2131752632, null), hl.i0(this.t3, false, false)));
            arrayList2.add(new s83(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, ob6.M0(2131752633, null), hl.i0(this.s3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i = 3;
        } else {
            i = 3;
            arrayList2.add(new s83(3, a0));
        }
        if (this.g3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new s83(i, false));
            }
            arrayList2.add(new s83(-2, R.drawable.msg_download_settings, -11565578, -13276952, ob6.M0(2131753764, null), null));
            int i18 = this.g3;
            if (i18 != 1) {
                i2 = 3;
                if (i18 != 3) {
                    str = null;
                    M0 = ob6.M0(2131753761, null);
                } else {
                    str = null;
                    M0 = ob6.M0(2131753762, null);
                }
            } else {
                str = null;
                i2 = 3;
                M0 = ob6.M0(2131753763, null);
            }
            arrayList2.add(new s83(i2, M0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new s83(5, ob6.M0(2131745818, str)));
        }
        arrayList2.add(new s83(3, false));
        v83 v83Var = this.i3;
        if (v83Var != null) {
            if (z) {
                v83Var.E(arrayList, arrayList2);
            } else {
                v83Var.f();
            }
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }
}
