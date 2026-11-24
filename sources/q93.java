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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q93 extends r59 {
    public static final /* synthetic */ int x3 = 0;
    public boolean f3;
    public int g3;
    public final u46 h3;
    public final o93 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public p93[] o3;
    public p93[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public n93 v3;
    public final /* synthetic */ t93 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(t93 t93Var, Activity activity) {
        super(activity, null);
        sy4 sy4Var;
        this.w3 = t93Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        sy4Var = ((d) t93Var).glassEngine;
        sy4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        u46 u46Var = new u46();
        this.h3 = u46Var;
        setLayoutManager(u46Var);
        o93 o93Var = new o93(this, (byte) 0);
        this.i3 = o93Var;
        setAdapter(o93Var);
        r1();
        setOnItemClickListener(new u(this, (byte) 20));
        sc3 sc3Var = new sc3();
        sc3Var.n(220L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        setItemAnimator(sc3Var);
        eh0.e(this, t93Var.h, t93Var.n, gm.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        t93 t93Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((d) t93Var).currentAccount;
            return b0b.c(i).h[this.g3 - 1];
        }
        i2 = ((d) t93Var).currentAccount;
        long j = b0b.c(i2).h[0];
        i3 = ((d) t93Var).currentAccount;
        long j2 = b0b.c(i3).h[1];
        i4 = ((d) t93Var).currentAccount;
        long[] jArr = {j, j2, b0b.c(i4).h[2]};
        long j3 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < 3; i6++) {
            long j4 = jArr[i6];
            if (j3 > j4) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final long B1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        t93 t93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) t93Var).currentAccount;
            return b0b.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((d) t93Var).currentAccount;
        long e = b0b.c(i3).e(0, i);
        i4 = ((d) t93Var).currentAccount;
        long e2 = b0b.c(i4).e(1, i) + e;
        i5 = ((d) t93Var).currentAccount;
        return b0b.c(i5).e(2, i) + e2;
    }

    public final void C1() {
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
        this.r3 = z1(6) + B1(6);
        this.s3 = z1(6);
        this.t3 = B1(6);
        if (this.o3 == null) {
            this.o3 = new p93[7];
        }
        if (this.p3 == null) {
            this.p3 = new p93[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = t93.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 >= length) {
                Arrays.sort(this.o3, new x03((byte) 3));
                gm.a3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
            int i15 = iArr[i14];
            long z1 = z1(i15) + B1(i15);
            p93[] p93VarArr = this.p3;
            p93[] p93VarArr2 = this.o3;
            long z12 = z1(iArr[i14]);
            long B1 = B1(iArr[i14]);
            int i16 = iArr[i14];
            int i17 = this.g3;
            t93 t93Var = this.w3;
            if (i17 == 1 || i17 == 2) {
                i = 2;
            } else {
                i = 2;
                if (i17 != 3) {
                    i11 = ((d) t93Var).currentAccount;
                    int i18 = b0b.c(i11).f[0][i16];
                    i12 = ((d) t93Var).currentAccount;
                    int i19 = b0b.c(i12).f[1][i16] + i18;
                    i13 = ((d) t93Var).currentAccount;
                    i3 = b0b.c(i13).f[2][i16] + i19;
                    i4 = iArr[i14];
                    i5 = this.g3;
                    if (i5 != 1 || i5 == i || i5 == 3) {
                        i6 = ((d) t93Var).currentAccount;
                        i7 = b0b.c(i6).e[this.g3 - 1][i4];
                    } else {
                        i8 = ((d) t93Var).currentAccount;
                        int i20 = b0b.c(i8).e[0][i4];
                        i9 = ((d) t93Var).currentAccount;
                        int i21 = b0b.c(i9).e[1][i4] + i20;
                        i10 = ((d) t93Var).currentAccount;
                        i7 = b0b.c(i10).e[2][i4] + i21;
                    }
                    p93 p93Var = new p93();
                    p93Var.d = i14;
                    p93Var.c = z1;
                    p93Var.b = true;
                    p93Var.e = z12;
                    p93Var.g = i3;
                    p93Var.f = B1;
                    p93Var.h = i7;
                    p93VarArr2[i14] = p93Var;
                    p93VarArr[i14] = p93Var;
                    fArr[i14] = z1 / this.r3;
                    i14++;
                }
            }
            i2 = ((d) t93Var).currentAccount;
            i3 = b0b.c(i2).f[this.g3 - 1][i16];
            i4 = iArr[i14];
            i5 = this.g3;
            if (i5 != 1) {
            }
            i6 = ((d) t93Var).currentAccount;
            i7 = b0b.c(i6).e[this.g3 - 1][i4];
            p93 p93Var2 = new p93();
            p93Var2.d = i14;
            p93Var2.c = z1;
            p93Var2.b = true;
            p93Var2.e = z12;
            p93Var2.g = i3;
            p93Var2.f = B1;
            p93Var2.h = i7;
            p93VarArr2[i14] = p93Var2;
            p93VarArr[i14] = p93Var2;
            fArr[i14] = z1 / this.r3;
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
    public final void D1(boolean z) {
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
        arrayList2.add(new l93(0, false));
        long j = 0;
        int i4 = 1;
        String a0 = this.r3 > 0 ? jb6.a0(null, null, 2131742471, jb6.D0().y0().format(A1())) : jb6.a0(null, null, 2131747923, jb6.D0().y0().format(A1()));
        arrayList2.add(new l93(1, a0));
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (true) {
            p93[] p93VarArr = this.o3;
            if (i5 >= p93VarArr.length) {
                break;
            }
            p93 p93Var = p93VarArr[i5];
            long j2 = j;
            long j3 = p93Var.c;
            int i6 = p93Var.d;
            if (this.u3) {
                c = 2;
            } else {
                c = 2;
                if (!this.n3.contains(Integer.valueOf(i6))) {
                    z2 = false;
                    if (j3 <= j2 || z2) {
                        int i7 = this.m3[i6];
                        SpannableString spannableString3 = new SpannableString(i7 > 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i7)));
                        spannableString3.setSpan(new z5c(gm.o()), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new k93(), 0, spannableString3.length(), 33);
                        int i8 = t93.w[i6];
                        int[] iArr = t93.r[i6];
                        int i9 = iArr[0];
                        int i10 = iArr[1];
                        if (j3 != j2) {
                            concat = jb6.M0(t93.x[i6], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = jb6.M0(t93.x[i6], null);
                            charSequenceArr[1] = "  ";
                            charSequenceArr[c] = spannableString3;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new l93(i5, i8, i9, i10, concat, gm.i0(j3, false, false)));
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
            spannableString32.setSpan(new z5c(gm.o()), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new k93(), 0, spannableString32.length(), 33);
            int i82 = t93.w[i6];
            int[] iArr2 = t93.r[i6];
            int i92 = iArr2[0];
            int i102 = iArr2[1];
            if (j3 != j2) {
            }
            arrayList3.add(new l93(i5, i82, i92, i102, concat, gm.i0(j3, false, false)));
            i5++;
            j = j2;
        }
        long j4 = j;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i11 = cmb.F6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            ylb ylbVar = this.o2;
            anb.x(this, mutate, i11, ylbVar, mode);
            mutate.setBounds(0, gm.L(2.0f), gm.L(16.0f), gm.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            anb.x(this, mutate2, i11, ylbVar, mode);
            mutate2.setBounds(0, gm.L(2.0f), gm.L(16.0f), gm.L(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                int i13 = ((l93) arrayList3.get(i12)).h;
                if (i13 < 0 || this.q3[i13]) {
                    spannableString = spannableString4;
                    i3 = i4;
                    spannableString2 = spannableString5;
                } else {
                    p93 p93Var2 = this.o3[i13];
                    int[] iArr3 = t93.y;
                    int i14 = p93Var2.d;
                    int i15 = p93Var2.g;
                    int i16 = p93Var2.h;
                    spannableString2 = spannableString5;
                    long j5 = p93Var2.f;
                    spannableString = spannableString4;
                    long j6 = p93Var2.e;
                    int i17 = iArr3[i14];
                    if (i17 == 0) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, l93.b(jb6.H(',', "OutgoingCallsCount", i16), gm.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, l93.b(jb6.H(',', "IncomingCallsCount", i15), gm.i0(j6, false, false)));
                        }
                    } else if (i17 != 1) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, l93.b(TextUtils.concat(spannableString, " ", gm.S2(jb6.H(',', "FilesSentCount", i16))), gm.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, l93.b(TextUtils.concat(spannableString2, " ", gm.S2(jb6.H(',', "FilesReceivedCount", i15))), gm.i0(j6, false, false)));
                        }
                    } else {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, l93.b(TextUtils.concat(spannableString, " ", jb6.M0(2131752604, null)), gm.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            i3 = 1;
                            arrayList3.add(i12, l93.b(TextUtils.concat(spannableString2, " ", jb6.M0(2131752605, null)), gm.i0(j6, false, false)));
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
                arrayList2.add(new l93(3, jb6.M0(2131751612, null).concat("\n")));
            }
        }
        if (!this.u3) {
            arrayList2.add(new l93(4, jb6.M0(2131743658, null)));
            arrayList2.add(new l93(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, jb6.M0(2131752604, null), gm.i0(this.t3, false, false)));
            arrayList2.add(new l93(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, jb6.M0(2131752605, null), gm.i0(this.s3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i = 3;
        } else {
            i = 3;
            arrayList2.add(new l93(3, a0));
        }
        if (this.g3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new l93(i, false));
            }
            arrayList2.add(new l93(-2, R.drawable.msg_download_settings, -11565578, -13276952, jb6.M0(2131753736, null), null));
            int i18 = this.g3;
            if (i18 != 1) {
                i2 = 3;
                if (i18 != 3) {
                    str = null;
                    M0 = jb6.M0(2131753733, null);
                } else {
                    str = null;
                    M0 = jb6.M0(2131753734, null);
                }
            } else {
                str = null;
                i2 = 3;
                M0 = jb6.M0(2131753735, null);
            }
            arrayList2.add(new l93(i2, M0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new l93(5, jb6.M0(2131745824, str)));
        }
        arrayList2.add(new l93(3, false));
        o93 o93Var = this.i3;
        if (o93Var != null) {
            if (z) {
                o93Var.E(arrayList, arrayList2);
            } else {
                o93Var.f();
            }
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    public final long z1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        t93 t93Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) t93Var).currentAccount;
            return b0b.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((d) t93Var).currentAccount;
        long d = b0b.c(i3).d(0, i);
        i4 = ((d) t93Var).currentAccount;
        long d2 = b0b.c(i4).d(1, i) + d;
        i5 = ((d) t93Var).currentAccount;
        return b0b.c(i5).d(2, i) + d2;
    }
}
