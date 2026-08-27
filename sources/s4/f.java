package s4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import d5.y;
import d5.z;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends i {
    public final z g = new z();
    public final y h = new y();
    public int i = -1;
    public final int j;
    public final e[] k;
    public e l;
    public List m;
    public List n;
    public y o;
    public int p;

    public f(int i10, List list) {
        this.j = i10 == -1 ? 1 : i10;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b10 = ((byte[]) list.get(0))[0];
        }
        this.k = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.k[i11] = new e();
        }
        this.l = this.k[0];
    }

    @Override // s4.i
    public final a5.b b() {
        List list = this.m;
        this.n = list;
        list.getClass();
        return new a5.b(1, list);
    }

    @Override // s4.i
    public final void c(g gVar) {
        ByteBuffer byteBuffer = gVar.b;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        z zVar = this.g;
        zVar.A(limit, array);
        while (zVar.a() >= 3) {
            int r10 = zVar.r();
            int i10 = r10 & 3;
            boolean z10 = (r10 & 4) == 4;
            byte r11 = (byte) zVar.r();
            byte r12 = (byte) zVar.r();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        f();
                        int i11 = (r11 & 192) >> 6;
                        int i12 = this.i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            h();
                            d5.a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i11);
                        }
                        this.i = i11;
                        int i13 = r11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        y yVar = new y(i11, i13);
                        this.o = yVar;
                        byte[] bArr = yVar.b;
                        yVar.e = 1;
                        bArr[0] = r12;
                    } else {
                        d5.a.f(i10 == 2);
                        y yVar2 = this.o;
                        if (yVar2 == null) {
                            d5.a.o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = yVar2.b;
                            int i14 = yVar2.e;
                            int i15 = i14 + 1;
                            yVar2.e = i15;
                            bArr2[i14] = r11;
                            yVar2.e = i14 + 2;
                            bArr2[i15] = r12;
                        }
                    }
                    y yVar3 = this.o;
                    if (yVar3.e == (yVar3.d * 2) - 1) {
                        f();
                    }
                }
            }
        }
    }

    @Override // s4.i
    public final boolean e() {
        return this.m != this.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f() {
        int i10;
        y yVar = this.o;
        if (yVar == null) {
            return;
        }
        int i11 = 2;
        if (yVar.e != (yVar.d * 2) - 1) {
            d5.a.n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.o.d * 2) - 1) + ", but current index is " + this.o.e + " (sequence number " + this.o.c + ");");
        }
        y yVar2 = this.o;
        byte[] bArr = yVar2.b;
        int i12 = yVar2.e;
        y yVar3 = this.h;
        yVar3.n(i12, bArr);
        boolean z10 = false;
        while (true) {
            if (yVar3.b() > 0) {
                int i13 = 3;
                int i14 = yVar3.i(3);
                int i15 = yVar3.i(5);
                if (i14 == 7) {
                    yVar3.s(i11);
                    i14 = yVar3.i(6);
                    if (i14 < 7) {
                        com.google.android.recaptcha.internal.a.s(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        d5.a.K("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.j) {
                    yVar3.t(i15);
                } else {
                    int g10 = (i15 * 8) + yVar3.g();
                    while (yVar3.g() < g10) {
                        int i16 = yVar3.i(8);
                        if (i16 == 16) {
                            i10 = g10;
                            int i17 = yVar3.i(8);
                            if (i17 <= 31) {
                                if (i17 > 7) {
                                    if (i17 <= 15) {
                                        yVar3.s(8);
                                    } else if (i17 <= 23) {
                                        yVar3.s(16);
                                    } else if (i17 <= 31) {
                                        yVar3.s(24);
                                    }
                                }
                            } else if (i17 <= 127) {
                                if (i17 == 32) {
                                    this.l.a(' ');
                                } else if (i17 == 33) {
                                    this.l.a((char) 160);
                                } else if (i17 == 37) {
                                    this.l.a((char) 8230);
                                } else if (i17 == 42) {
                                    this.l.a((char) 352);
                                } else if (i17 == 44) {
                                    this.l.a((char) 338);
                                } else if (i17 == 63) {
                                    this.l.a((char) 376);
                                } else if (i17 == 57) {
                                    this.l.a((char) 8482);
                                } else if (i17 == 58) {
                                    this.l.a((char) 353);
                                } else if (i17 == 60) {
                                    this.l.a((char) 339);
                                } else if (i17 != 61) {
                                    switch (i17) {
                                        case 48:
                                            this.l.a((char) 9608);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            this.l.a((char) 8216);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            this.l.a((char) 8217);
                                            break;
                                        case 51:
                                            this.l.a((char) 8220);
                                            break;
                                        case 52:
                                            this.l.a((char) 8221);
                                            break;
                                        case 53:
                                            this.l.a((char) 8226);
                                            break;
                                        default:
                                            switch (i17) {
                                                case 118:
                                                    this.l.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.l.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.l.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.l.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.l.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.l.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.l.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.l.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.l.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.l.a((char) 9484);
                                                    break;
                                                default:
                                                    com.google.android.recaptcha.internal.a.s(i17, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.l.a((char) 8480);
                                }
                                z10 = true;
                            } else if (i17 <= 159) {
                                if (i17 <= 135) {
                                    yVar3.s(32);
                                } else if (i17 <= 143) {
                                    yVar3.s(40);
                                } else if (i17 <= 159) {
                                    yVar3.s(2);
                                    yVar3.s(yVar3.i(6) * 8);
                                }
                            } else if (i17 <= 255) {
                                if (i17 == 160) {
                                    this.l.a((char) 13252);
                                } else {
                                    com.google.android.recaptcha.internal.a.s(i17, "Invalid G3 character: ", "Cea708Decoder");
                                    this.l.a('_');
                                }
                                z10 = true;
                            } else {
                                com.google.android.recaptcha.internal.a.s(i17, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (i16 <= 31) {
                            if (i16 != 0) {
                                if (i16 == i13) {
                                    this.m = g();
                                } else if (i16 != 8) {
                                    switch (i16) {
                                        case 12:
                                            h();
                                            break;
                                        case 13:
                                            this.l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i16 < 17 || i16 > 23) {
                                                if (i16 < 24 || i16 > 31) {
                                                    com.google.android.recaptcha.internal.a.s(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                    yVar3.s(16);
                                                    break;
                                                }
                                            } else {
                                                d5.a.K("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                yVar3.s(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.l.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i10 = g10;
                        } else if (i16 <= 127) {
                            if (i16 == 127) {
                                this.l.a((char) 9835);
                            } else {
                                this.l.a((char) (i16 & 255));
                            }
                            i10 = g10;
                            z10 = true;
                        } else {
                            if (i16 <= 159) {
                                e[] eVarArr = this.k;
                                switch (i16) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i10 = g10;
                                        int i18 = i16 - 128;
                                        if (this.p != i18) {
                                            this.p = i18;
                                            this.l = eVarArr[i18];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        i10 = g10;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (yVar3.h()) {
                                                e eVar = eVarArr[8 - i19];
                                                eVar.a.clear();
                                                eVar.b.clear();
                                                eVar.p = -1;
                                                eVar.q = -1;
                                                eVar.r = -1;
                                                eVar.t = -1;
                                                eVar.v = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i10 = g10;
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (yVar3.h()) {
                                                eVarArr[8 - i20].d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        i10 = g10;
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (yVar3.h()) {
                                                eVarArr[8 - i21].d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        i10 = g10;
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (yVar3.h()) {
                                                eVarArr[8 - i22].d = !r1.d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        i10 = g10;
                                        for (int i23 = 1; i23 <= 8; i23++) {
                                            if (yVar3.h()) {
                                                eVarArr[8 - i23].d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        i10 = g10;
                                        yVar3.s(8);
                                        break;
                                    case 142:
                                        i10 = g10;
                                        break;
                                    case 143:
                                        i10 = g10;
                                        h();
                                        break;
                                    case 144:
                                        i10 = g10;
                                        if (!this.l.c) {
                                            yVar3.s(16);
                                            break;
                                        } else {
                                            yVar3.i(4);
                                            yVar3.i(2);
                                            yVar3.i(2);
                                            boolean h = yVar3.h();
                                            boolean h10 = yVar3.h();
                                            yVar3.i(3);
                                            yVar3.i(3);
                                            this.l.e(h, h10);
                                        }
                                    case 145:
                                        i10 = g10;
                                        if (this.l.c) {
                                            int c10 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                            int c11 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                            yVar3.s(2);
                                            e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                            this.l.f(c10, c11);
                                        } else {
                                            yVar3.s(24);
                                        }
                                        break;
                                    case 146:
                                        i10 = g10;
                                        if (this.l.c) {
                                            yVar3.s(4);
                                            int i24 = yVar3.i(4);
                                            yVar3.s(2);
                                            yVar3.i(6);
                                            e eVar2 = this.l;
                                            if (eVar2.v != i24) {
                                                eVar2.a('\n');
                                            }
                                            eVar2.v = i24;
                                        } else {
                                            yVar3.s(16);
                                        }
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                    default:
                                        com.google.android.recaptcha.internal.a.s(i16, "Invalid C1 command: ", "Cea708Decoder");
                                        i10 = g10;
                                        break;
                                    case 151:
                                        i10 = g10;
                                        if (this.l.c) {
                                            int c12 = e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), yVar3.i(2));
                                            yVar3.i(2);
                                            e.c(yVar3.i(2), yVar3.i(2), yVar3.i(2), 0);
                                            yVar3.h();
                                            yVar3.h();
                                            yVar3.i(2);
                                            yVar3.i(2);
                                            int i25 = yVar3.i(2);
                                            yVar3.s(8);
                                            e eVar3 = this.l;
                                            eVar3.o = c12;
                                            eVar3.l = i25;
                                        } else {
                                            yVar3.s(32);
                                        }
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i26 = i16 - 152;
                                        e eVar4 = eVarArr[i26];
                                        yVar3.s(i11);
                                        boolean h11 = yVar3.h();
                                        boolean h12 = yVar3.h();
                                        yVar3.h();
                                        int i27 = yVar3.i(i13);
                                        boolean h13 = yVar3.h();
                                        int i28 = yVar3.i(7);
                                        int i29 = yVar3.i(8);
                                        int i30 = yVar3.i(4);
                                        int i31 = yVar3.i(4);
                                        yVar3.s(i11);
                                        yVar3.i(6);
                                        yVar3.s(i11);
                                        int i32 = yVar3.i(3);
                                        int i33 = yVar3.i(3);
                                        ArrayList arrayList = eVar4.a;
                                        i10 = g10;
                                        eVar4.c = true;
                                        eVar4.d = h11;
                                        eVar4.k = h12;
                                        eVar4.e = i27;
                                        eVar4.f = h13;
                                        eVar4.g = i28;
                                        eVar4.h = i29;
                                        eVar4.i = i30;
                                        int i34 = i31 + 1;
                                        if (eVar4.j != i34) {
                                            eVar4.j = i34;
                                            while (true) {
                                                if ((h12 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i32 != 0 && eVar4.m != i32) {
                                            eVar4.m = i32;
                                            int i35 = i32 - 1;
                                            int i36 = e.C[i35];
                                            boolean z11 = e.B[i35];
                                            int i37 = e.z[i35];
                                            int i38 = e.A[i35];
                                            int i39 = e.y[i35];
                                            eVar4.o = i36;
                                            eVar4.l = i39;
                                        }
                                        if (i33 != 0 && eVar4.n != i33) {
                                            eVar4.n = i33;
                                            int i40 = i33 - 1;
                                            int i41 = e.E[i40];
                                            int i42 = e.D[i40];
                                            eVar4.e(false, false);
                                            eVar4.f(e.w, e.F[i40]);
                                        }
                                        if (this.p != i26) {
                                            this.p = i26;
                                            this.l = eVarArr[i26];
                                        }
                                        break;
                                }
                            } else {
                                i10 = g10;
                                if (i16 <= 255) {
                                    this.l.a((char) (i16 & 255));
                                } else {
                                    com.google.android.recaptcha.internal.a.s(i16, "Invalid base command: ", "Cea708Decoder");
                                }
                            }
                            z10 = true;
                        }
                        g10 = i10;
                        i11 = 2;
                        i13 = 3;
                    }
                }
            }
        }
        if (z10) {
            this.m = g();
        }
        this.o = null;
    }

    @Override // s4.i, k3.e
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        h();
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List g() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            e[] eVarArr = this.k;
            e eVar = eVarArr[i13];
            if (eVar.c && (!eVar.a.isEmpty() || eVar.b.length() != 0)) {
                e eVar2 = eVarArr[i13];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.a;
                    if (!eVar2.c || (arrayList2.isEmpty() && eVar2.b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i15 = eVar2.l;
                        if (i15 != 0) {
                            if (i15 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i15 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i15 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.l);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (eVar2.f) {
                                f10 = eVar2.h / 209.0f;
                                f11 = eVar2.g / 74.0f;
                            } else {
                                f10 = eVar2.h / 99.0f;
                                f11 = eVar2.g / 99.0f;
                            }
                            float f12 = (f10 * 0.9f) + 0.05f;
                            float f13 = (f11 * 0.9f) + 0.05f;
                            int i16 = eVar2.i;
                            i10 = i16 / 3;
                            if (i10 != 0) {
                                i11 = i16;
                                i12 = 0;
                            } else if (i10 == 1) {
                                i11 = i16;
                                i12 = 1;
                            } else {
                                i11 = i16;
                                i12 = 2;
                            }
                            int i17 = i11 % 3;
                            int i18 = i17 != 0 ? 0 : i17 == 1 ? 1 : 2;
                            int i19 = eVar2.o;
                            dVar = new d(spannableStringBuilder, alignment2, f13, i12, f12, i18, i19 == e.x, i19, eVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (eVar2.f) {
                        }
                        float f122 = (f10 * 0.9f) + 0.05f;
                        float f132 = (f11 * 0.9f) + 0.05f;
                        int i162 = eVar2.i;
                        i10 = i162 / 3;
                        if (i10 != 0) {
                        }
                        int i172 = i11 % 3;
                        if (i172 != 0) {
                        }
                        int i192 = eVar2.o;
                        dVar = new d(spannableStringBuilder, alignment22, f132, i12, f122, i18, i192 == e.x, i192, eVar2.e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            arrayList3.add(((d) arrayList.get(i20)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    @Override // k3.e
    public final String getName() {
        return "Cea708Decoder";
    }

    public final void h() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.k[i10].d();
        }
    }
}
