package q3;

import f5.d0;
import f5.w;
import j3.s0;
import j3.t0;
import java.util.Arrays;
import org.telegram.messenger.MediaController;
import q8.l;
import q8.l0;
import q8.x;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f implements a {
    public final z a;
    public final int b;

    public f(int i10, l0 l0Var) {
        this.b = i10;
        this.a = l0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, w wVar) {
        a gVar;
        String str;
        int i11 = 4;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = wVar.c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (wVar.a() > 8) {
            int g10 = wVar.g();
            int g11 = wVar.b + wVar.g();
            wVar.B(g11);
            if (g10 != 1414744396) {
                d dVar = null;
                switch (g10) {
                    case 1718776947:
                        if (i14 == 2) {
                            wVar.D(i11);
                            int g12 = wVar.g();
                            int g13 = wVar.g();
                            wVar.D(i11);
                            int g14 = wVar.g();
                            switch (g14) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MediaController.VIDEO_MIME_TYPE;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                s0 s0Var = new s0();
                                s0Var.t = g12;
                                s0Var.u = g13;
                                s0Var.o = str;
                                gVar = new g(new t0(s0Var));
                                break;
                            } else {
                                com.google.android.recaptcha.internal.a.s(g14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int k9 = wVar.k();
                                String str2 = k9 != 1 ? k9 != 85 ? k9 != 255 ? k9 != 8192 ? k9 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : MediaController.AUDIO_MIME_TYPE : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int k10 = wVar.k();
                                    int g15 = wVar.g();
                                    wVar.D(6);
                                    int u10 = d0.u(wVar.w());
                                    int k11 = wVar.k();
                                    byte[] bArr = new byte[k11];
                                    wVar.c(i13, k11, bArr);
                                    s0 s0Var2 = new s0();
                                    s0Var2.o = str2;
                                    s0Var2.B = k10;
                                    s0Var2.C = g15;
                                    if ("audio/raw".equals(str2) && u10 != 0) {
                                        s0Var2.D = u10;
                                    }
                                    if (MediaController.AUDIO_MIME_TYPE.equals(str2) && k11 > 0) {
                                        s0Var2.q = z.y(bArr);
                                    }
                                    gVar = new g(new t0(s0Var2));
                                    break;
                                } else {
                                    com.google.android.recaptcha.internal.a.s(k9, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                f5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.B(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int g16 = wVar.g();
                        wVar.D(8);
                        int g17 = wVar.g();
                        int g18 = wVar.g();
                        wVar.D(i11);
                        wVar.g();
                        wVar.D(12);
                        gVar = new c(g16, g17, g18);
                        break;
                    case 1752331379:
                        int g19 = wVar.g();
                        wVar.D(12);
                        wVar.g();
                        int g20 = wVar.g();
                        int g21 = wVar.g();
                        wVar.D(i11);
                        int g22 = wVar.g();
                        int g23 = wVar.g();
                        wVar.D(8);
                        dVar = new d(g19, g20, g21, g22, g23);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.p(wVar.a(), p8.d.c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(wVar.g(), wVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 == 1935963489) {
                        i14 = 1;
                    } else if (i16 != 1937012852) {
                        f5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                        i14 = -1;
                    } else {
                        i14 = 3;
                    }
                }
                int i17 = i15 + 1;
                if (objArr.length < i17) {
                    objArr = Arrays.copyOf(objArr, q8.w.d(objArr.length, i17));
                }
                objArr[i15] = gVar;
                i15 = i17;
            }
            wVar.C(g11);
            wVar.B(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, z.s(i15, objArr));
    }

    public final a a(Class cls) {
        x listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // q3.a
    public final int getType() {
        return this.b;
    }
}
