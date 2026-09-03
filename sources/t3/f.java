package t3;

import h5.d0;
import h5.w;
import j3.m0;
import j3.n0;
import java.util.Arrays;
import org.telegram.messenger.MediaController;
import s8.i0;
import s8.l;
import s8.t;
import s8.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements a {
    public final v a;
    public final int b;

    public f(int i10, i0 i0Var) {
        this.b = i10;
        this.a = i0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i10, w wVar) {
        a gVar;
        String str;
        int i11 = 4;
        l.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = wVar.c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (wVar.a() > 8) {
            int i16 = wVar.i();
            int i17 = wVar.b + wVar.i();
            wVar.E(i17);
            if (i16 != 1414744396) {
                d dVar = null;
                switch (i16) {
                    case 1718776947:
                        if (i14 == 2) {
                            wVar.G(i11);
                            int i18 = wVar.i();
                            int i19 = wVar.i();
                            wVar.G(i11);
                            int i20 = wVar.i();
                            switch (i20) {
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
                                m0 m0Var = new m0();
                                m0Var.t = i18;
                                m0Var.u = i19;
                                m0Var.o = str;
                                gVar = new g(new n0(m0Var));
                                break;
                            } else {
                                e2.c.q(i20, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int n10 = wVar.n();
                                String str2 = n10 != 1 ? n10 != 85 ? n10 != 255 ? n10 != 8192 ? n10 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : MediaController.AUDIO_MIME_TYPE : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int n11 = wVar.n();
                                    int i21 = wVar.i();
                                    wVar.G(6);
                                    int v = d0.v(wVar.z());
                                    int n12 = wVar.n();
                                    byte[] bArr = new byte[n12];
                                    wVar.e(i13, n12, bArr);
                                    m0 m0Var2 = new m0();
                                    m0Var2.o = str2;
                                    m0Var2.B = n11;
                                    m0Var2.C = i21;
                                    if ("audio/raw".equals(str2) && v != 0) {
                                        m0Var2.D = v;
                                    }
                                    if (MediaController.AUDIO_MIME_TYPE.equals(str2) && n12 > 0) {
                                        m0Var2.q = v.x(bArr);
                                    }
                                    gVar = new g(new n0(m0Var2));
                                    break;
                                } else {
                                    e2.c.q(n10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                h5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.B(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int i22 = wVar.i();
                        wVar.G(8);
                        int i23 = wVar.i();
                        int i24 = wVar.i();
                        wVar.G(i11);
                        wVar.i();
                        wVar.G(12);
                        gVar = new c(i22, i23, i24);
                        break;
                    case 1752331379:
                        int i25 = wVar.i();
                        wVar.G(12);
                        wVar.i();
                        int i26 = wVar.i();
                        int i27 = wVar.i();
                        wVar.G(i11);
                        int i28 = wVar.i();
                        int i29 = wVar.i();
                        wVar.G(8);
                        dVar = new d(i25, i26, i27, i28, i29);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(wVar.s(wVar.a(), r8.d.c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(wVar.i(), wVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i30 = ((d) gVar).a;
                    if (i30 == 1935960438) {
                        i14 = 2;
                    } else if (i30 == 1935963489) {
                        i14 = 1;
                    } else if (i30 != 1937012852) {
                        h5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i30));
                        i14 = -1;
                    } else {
                        i14 = 3;
                    }
                }
                int i31 = i15 + 1;
                if (objArr.length < i31) {
                    objArr = Arrays.copyOf(objArr, com.google.android.gms.common.api.internal.w.g(objArr.length, i31));
                }
                objArr[i15] = gVar;
                i15 = i31;
            }
            wVar.F(i17);
            wVar.E(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, v.s(i15, objArr));
    }

    public final a a(Class cls) {
        t listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // t3.a
    public final int getType() {
        return this.b;
    }
}
