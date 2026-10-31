package vh;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ff;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.v20;
import org.telegram.messenger.w20;
import org.telegram.messenger.ye;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.me0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final ff E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long a;
    public final long a0;
    public final long b;
    public final float b0;
    public final String c;
    public final float c0;
    public final String d;
    public final float d0;
    public final boolean e;
    public final float e0;
    public final String f;
    public final TLRPC.InputPeer f0;
    public final boolean g;
    public final long g0;
    public final boolean h;
    public final String h0;
    public final long i;
    public final TLRPC.InputMedia i0;
    public final long j;
    public final r j0;
    public final int k;
    public final ArrayList k0;
    public final int l;
    public final int m;
    public final int n;
    public final ye o;
    public final int p;
    public final int q;
    public final long r;
    public final float[] s;
    public final int t;
    public final int u;
    public final String v;
    public final ArrayList w;
    public final ArrayList x;
    public final String y;
    public final String z;

    public r0(n5 n5Var) {
        float[] fArr = new float[9];
        this.s = fArr;
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        this.a = n5Var.b;
        this.b = n5Var.d;
        File file = n5Var.O0;
        this.c = file == null ? "" : file.toString();
        File file2 = n5Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = n5Var.K;
        File file3 = n5Var.L;
        this.f = file3 == null ? "" : file3.toString();
        this.g = n5Var.M;
        this.h = n5Var.Y;
        float f7 = n5Var.Z;
        long j10 = n5Var.h0;
        this.i = (long) (f7 * j10);
        this.j = (long) (n5Var.a0 * j10);
        this.k = n5Var.Q;
        this.l = n5Var.R;
        this.m = n5Var.k0;
        this.n = n5Var.l0;
        this.o = n5Var.m0;
        this.p = n5Var.i0;
        this.q = n5Var.j0;
        this.r = j10;
        n5Var.n0.getValues(fArr);
        this.t = n5Var.A0;
        this.u = n5Var.B0;
        CharSequence[] charSequenceArr = {n5Var.C0};
        this.w = n5Var.D0 ? ui.b0(n5Var.a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(n5Var.F0);
        File file4 = n5Var.P0;
        this.y = file4 == null ? "" : file4.toString();
        File file5 = n5Var.R0;
        this.z = file5 == null ? "" : file5.toString();
        this.A = n5Var.S0;
        this.B = n5Var.T0;
        this.C = n5Var.U0;
        File file6 = n5Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = n5Var.a1;
        this.F = n5Var.I0;
        this.M = n5Var.w;
        this.N = n5Var.x;
        this.O = n5Var.y;
        this.P = n5Var.z;
        this.Q = n5Var.A;
        this.R = n5Var.B;
        this.S = n5Var.C;
        this.T = n5Var.D;
        this.U = n5Var.E;
        this.V = n5Var.F;
        this.W = n5Var.G;
        File file7 = n5Var.o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = n5Var.p0;
        this.Z = n5Var.q0;
        this.a0 = n5Var.r0;
        this.b0 = n5Var.s0;
        this.c0 = n5Var.t0;
        this.d0 = n5Var.u0;
        this.e0 = n5Var.P;
        this.f0 = n5Var.v0;
        this.g0 = n5Var.J0;
        this.h0 = n5Var.K0;
        this.i0 = n5Var.L0;
        this.j0 = n5Var.S;
        this.k0 = w20.a(n5Var);
    }

    public final n5 a() {
        n5 n5Var = new n5();
        n5Var.b = this.a;
        n5Var.c = true;
        n5Var.d = this.b;
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            n5Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            n5Var.N0 = new File(str2);
        }
        n5Var.K = this.e;
        String str3 = this.f;
        if (str3 != null) {
            n5Var.L = new File(str3);
        }
        n5Var.M = this.g;
        n5Var.Y = this.h;
        long j10 = this.r;
        n5Var.h0 = j10;
        if (j10 > 0) {
            n5Var.Z = this.i / j10;
            n5Var.a0 = this.j / j10;
        } else {
            n5Var.Z = 0.0f;
            n5Var.a0 = 1.0f;
        }
        n5Var.Q = this.k;
        n5Var.R = this.l;
        n5Var.k0 = this.m;
        n5Var.l0 = this.n;
        n5Var.m0 = this.o;
        n5Var.i0 = this.p;
        n5Var.j0 = this.q;
        n5Var.n0.setValues(this.s);
        n5Var.A0 = this.t;
        n5Var.B0 = this.u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i10 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.t6.o2 == null) {
                org.telegram.ui.ActionBar.t6.Q();
            }
            CharSequence m10 = org.telegram.messenger.k6.m(spannableString, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), true, null, 0);
            jj.b(m10, this.w, true, false, true, false, 0);
            n5Var.C0 = jj.A5(m10, this.w, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false);
        } else {
            n5Var.C0 = "";
        }
        ArrayList arrayList2 = n5Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.x);
        String str5 = this.y;
        if (str5 != null) {
            n5Var.P0 = new File(str5);
        }
        String str6 = this.z;
        if (str6 != null) {
            n5Var.R0 = new File(str6);
        }
        n5Var.S0 = this.A;
        n5Var.T0 = this.B;
        n5Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            n5Var.Z0 = new File(str7);
        }
        n5Var.a1 = this.E;
        n5Var.I0 = this.F;
        n5Var.g = this.G;
        n5Var.f = this.H;
        n5Var.e = this.I;
        n5Var.J = this.L;
        n5Var.I = this.K;
        n5Var.H = this.J;
        n5Var.w = this.M;
        n5Var.x = this.N;
        n5Var.y = this.O;
        n5Var.z = this.P;
        n5Var.A = this.Q;
        n5Var.B = this.R;
        n5Var.C = this.S;
        n5Var.D = this.T;
        n5Var.E = this.U;
        n5Var.F = this.V;
        n5Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            n5Var.o0 = new File(str8);
        }
        n5Var.p0 = this.Y;
        n5Var.q0 = this.Z;
        n5Var.r0 = this.a0;
        n5Var.s0 = this.b0;
        n5Var.t0 = this.c0;
        n5Var.u0 = this.d0;
        n5Var.P = this.e0;
        n5Var.v0 = this.f0;
        n5Var.J0 = this.g0;
        n5Var.K0 = this.h0;
        n5Var.L0 = this.i0;
        n5Var.S = this.j0;
        int i11 = w20.C;
        ArrayList arrayList3 = this.k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                w20 w20Var = (w20) obj;
                n5 n5Var2 = new n5();
                n5Var2.K = w20Var.b;
                n5Var2.Y = w20Var.c;
                n5Var2.L = new File(w20Var.d);
                n5Var2.P = w20Var.e;
                n5Var2.U = w20Var.i;
                n5Var2.X = w20Var.f;
                n5Var2.V = w20Var.j;
                n5Var2.W = w20Var.k;
                n5Var2.k0 = w20Var.l;
                n5Var2.l0 = w20Var.m;
                n5Var2.h0 = w20Var.o;
                arrayList.add(n5Var2);
            }
        }
        n5Var.T = arrayList;
        return n5Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.b);
        nativeByteBuffer.writeString(this.c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f);
        nativeByteBuffer.writeBool(this.g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.i);
        nativeByteBuffer.writeInt64(this.j);
        nativeByteBuffer.writeInt32(this.k);
        nativeByteBuffer.writeInt32(this.l);
        nativeByteBuffer.writeInt32(this.m);
        nativeByteBuffer.writeInt32(this.n);
        nativeByteBuffer.writeInt32(this.p);
        nativeByteBuffer.writeInt32(this.q);
        nativeByteBuffer.writeInt64(this.r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.t);
        nativeByteBuffer.writeInt32(this.u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList2 = this.w;
        nativeByteBuffer.writeInt32(arrayList2 == null ? 0 : arrayList2.size());
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.MessageEntity) arrayList2.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList3 = this.x;
        nativeByteBuffer.writeInt32(arrayList3 == null ? 0 : arrayList3.size());
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i13)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(Vector.constructor);
        ArrayList arrayList4 = this.B;
        nativeByteBuffer.writeInt32(arrayList4 == null ? 0 : arrayList4.size());
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((v20) arrayList4.get(i14)).b(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(Vector.constructor);
        List list = this.C;
        nativeByteBuffer.writeInt32(list == null ? 0 : list.size());
        if (list != null) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((TLRPC.InputDocument) list.get(i15)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = this.D;
        if (str == null) {
            str = "";
        }
        nativeByteBuffer.writeString(str);
        ff ffVar = this.E;
        if (ffVar == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(ffVar.a);
            nativeByteBuffer.writeFloat(ffVar.b);
            nativeByteBuffer.writeFloat(ffVar.c);
            nativeByteBuffer.writeFloat(ffVar.d);
            nativeByteBuffer.writeFloat(ffVar.e);
            nativeByteBuffer.writeFloat(ffVar.f);
            nativeByteBuffer.writeFloat(ffVar.g);
            nativeByteBuffer.writeInt32(ffVar.h);
            nativeByteBuffer.writeInt32(ffVar.i);
            nativeByteBuffer.writeFloat(ffVar.j);
            nativeByteBuffer.writeFloat(ffVar.k);
            nativeByteBuffer.writeFloat(ffVar.l);
            nativeByteBuffer.writeFloat(ffVar.m);
            nativeByteBuffer.writeInt32(ffVar.n);
            nativeByteBuffer.writeFloat(ffVar.o);
            e2.c cVar = ffVar.p;
            ((me0) cVar.b).d(nativeByteBuffer);
            ((me0) cVar.c).d(nativeByteBuffer);
            ((me0) cVar.d).d(nativeByteBuffer);
            ((me0) cVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(ffVar.q);
            if (ffVar.r == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(ffVar.r.x);
                nativeByteBuffer.writeFloat(ffVar.r.y);
            }
            nativeByteBuffer.writeFloat(ffVar.s);
            nativeByteBuffer.writeFloat(ffVar.t);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(Vector.constructor);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str2 = this.O;
        if (str2 == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(TLRPC.TL_documentAttributeAudio.constructor);
            nativeByteBuffer.writeString(str2);
            String str3 = this.Q;
            if (str3 == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(TLRPC.TL_jsonString.constructor);
                nativeByteBuffer.writeString(str3);
            }
            String str4 = this.R;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
            } else {
                nativeByteBuffer.writeInt32(TLRPC.TL_jsonString.constructor);
                nativeByteBuffer.writeString(str4);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str5 = this.X;
        if (TextUtils.isEmpty(str5)) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(TLRPC.TL_documentAttributeVideo.constructor);
            nativeByteBuffer.writeString(str5);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.a0);
            nativeByteBuffer.writeFloat(this.b0);
            nativeByteBuffer.writeFloat(this.c0);
            nativeByteBuffer.writeFloat(this.d0);
        }
        nativeByteBuffer.writeFloat(this.e0);
        nativeByteBuffer.writeInt64(this.g0);
        String str6 = this.h0;
        nativeByteBuffer.writeString(str6 != null ? str6 : "");
        TLRPC.InputMedia inputMedia = this.i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.j0;
        if (rVar == null || rVar.e.size() <= 1 || (arrayList = this.k0) == null || arrayList.size() <= 1) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.a);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((w20) obj).serializeToStream(nativeByteBuffer);
            }
        }
        ye yeVar = this.o;
        if (yeVar == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            yeVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(TLRPC.TL_null.constructor);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public r0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.s = new float[9];
        this.x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.d0 = 1.0f;
        this.e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.c = readString;
            if (readString != null && readString.length() == 0) {
                this.c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f = null;
            }
            this.g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.i = nativeByteBuffer.readInt64(true);
            this.j = nativeByteBuffer.readInt64(true);
            this.k = nativeByteBuffer.readInt32(true);
            this.l = nativeByteBuffer.readInt32(true);
            this.m = nativeByteBuffer.readInt32(true);
            this.n = nativeByteBuffer.readInt32(true);
            this.p = nativeByteBuffer.readInt32(true);
            this.q = nativeByteBuffer.readInt32(true);
            this.r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.t = nativeByteBuffer.readInt32(true);
            this.u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.w == null) {
                        this.w = new ArrayList();
                    }
                    this.w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new v20(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i14 = 0; i14 < readInt325; i14++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                ff ffVar = new ff();
                                this.E = ffVar;
                                ffVar.a = nativeByteBuffer.readFloat(true);
                                ffVar.b = nativeByteBuffer.readFloat(true);
                                ffVar.c = nativeByteBuffer.readFloat(true);
                                ffVar.d = nativeByteBuffer.readFloat(true);
                                ffVar.e = nativeByteBuffer.readFloat(true);
                                ffVar.f = nativeByteBuffer.readFloat(true);
                                ffVar.g = nativeByteBuffer.readFloat(true);
                                ffVar.h = nativeByteBuffer.readInt32(true);
                                ffVar.i = nativeByteBuffer.readInt32(true);
                                ffVar.j = nativeByteBuffer.readFloat(true);
                                ffVar.k = nativeByteBuffer.readFloat(true);
                                ffVar.l = nativeByteBuffer.readFloat(true);
                                ffVar.m = nativeByteBuffer.readFloat(true);
                                ffVar.n = nativeByteBuffer.readInt32(true);
                                ffVar.o = nativeByteBuffer.readFloat(true);
                                e2.c cVar = ffVar.p;
                                ((me0) cVar.b).c(nativeByteBuffer);
                                ((me0) cVar.c).c(nativeByteBuffer);
                                ((me0) cVar.d).c(nativeByteBuffer);
                                ((me0) cVar.e).c(nativeByteBuffer);
                                ffVar.q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    ffVar.r = null;
                                } else {
                                    if (ffVar.r == null) {
                                        ffVar.r = new PointF();
                                    }
                                    ffVar.r.x = nativeByteBuffer.readFloat(true);
                                    ffVar.r.y = nativeByteBuffer.readFloat(true);
                                }
                                ffVar.s = nativeByteBuffer.readFloat(true);
                                ffVar.t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.a0 = nativeByteBuffer.readInt64(true);
                                this.b0 = nativeByteBuffer.readFloat(true);
                                this.c0 = nativeByteBuffer.readFloat(true);
                                this.d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.g0 = nativeByteBuffer.readInt64(true);
                                this.h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.j0 = new r(nativeByteBuffer.readString(true));
                                this.k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.j0.e.size(); i15++) {
                                    w20 w20Var = new w20();
                                    w20Var.readParams(nativeByteBuffer, true);
                                    w20Var.r = (q) this.j0.e.get(i15);
                                    this.k0.add(w20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                ye yeVar = new ye();
                                this.o = yeVar;
                                yeVar.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
