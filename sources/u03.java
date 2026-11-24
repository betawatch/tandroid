// default package

import android.util.Base64;
import android.util.JsonReader;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u03 implements v03, z0c, x76 {
    public final /* synthetic */ byte a;

    public /* synthetic */ u03(tk tkVar, int i, int i2, boolean z) {
        this.a = (byte) 22;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // v03
    public final Object a(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = 3;
        switch (this.a) {
            case 0:
                fa0 fa0Var = new fa0();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1536268810:
                            if (nextName.equals("parameterKey")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case -1027290370:
                            if (nextName.equals("templateVersion")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 1098747284:
                            if (nextName.equals("rolloutVariant")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        case 1124454216:
                            if (nextName.equals("parameterValue")) {
                                z = 3;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                gxc.d("Null parameterKey");
                                return null;
                            }
                            fa0Var.b = nextString;
                            break;
                        case true:
                            fa0Var.d = jsonReader.nextLong();
                            fa0Var.e = (byte) (fa0Var.e | 1);
                            break;
                        case true:
                            jsonReader.beginObject();
                            String str = null;
                            String str2 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (nextName2.equals("variantId")) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        gxc.d("Null variantId");
                                        return null;
                                    }
                                } else if (nextName2.equals("rolloutId")) {
                                    str = jsonReader.nextString();
                                    if (str == null) {
                                        gxc.d("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str != null && str2 != null) {
                                fa0Var.a = new ha0(str, str2);
                                break;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                if (str == null) {
                                    sb.append(" rolloutId");
                                }
                                if (str2 == null) {
                                    sb.append(" variantId");
                                }
                                dq9.m(ts2.n("Missing required properties:", sb));
                                return null;
                            }
                        case true:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                gxc.d("Null parameterValue");
                                return null;
                            }
                            fa0Var.c = nextString2;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return fa0Var.a();
            case 1:
                jsonReader.beginObject();
                byte b2 = 0;
                int i = 0;
                String str3 = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1266514778:
                            if (nextName3.equals("frames")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 3373707:
                            if (nextName3.equals("name")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 2125650548:
                            if (nextName3.equals("importance")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            list = w03.b(jsonReader, new u03(b));
                            if (list != null) {
                                break;
                            } else {
                                gxc.d("Null frames");
                                return null;
                            }
                        case true:
                            str3 = jsonReader.nextString();
                            if (str3 != null) {
                                break;
                            } else {
                                gxc.d("Null name");
                                return null;
                            }
                        case true:
                            i = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 1 && str3 != null && list != null) {
                    return new y90(str3, i, list);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str3 == null) {
                    sb2.append(" name");
                }
                if ((b2 & 1) == 0) {
                    sb2.append(" importance");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                dq9.m(ts2.n("Missing required properties:", sb2));
                return null;
            case 2:
                jsonReader.beginObject();
                byte b3 = 0;
                String str4 = null;
                String str5 = null;
                long j = 0;
                long j2 = 0;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case 3373707:
                            if (nextName4.equals("name")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3530753:
                            if (nextName4.equals("size")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 3601339:
                            if (nextName4.equals("uuid")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1153765347:
                            if (nextName4.equals("baseAddress")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        case false:
                            str4 = jsonReader.nextString();
                            if (str4 != null) {
                                break;
                            } else {
                                gxc.d("Null name");
                                return null;
                            }
                        case true:
                            b3 = (byte) (b3 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case true:
                            str5 = new String(Base64.decode(jsonReader.nextString(), 2), s03.a);
                            break;
                        case true:
                            b3 = (byte) (b3 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b3 == 3 && str4 != null) {
                    return new v90(str4, str5, j, j2);
                }
                StringBuilder sb3 = new StringBuilder();
                if ((b3 & 1) == 0) {
                    sb3.append(" baseAddress");
                }
                if ((b3 & 2) == 0) {
                    sb3.append(" size");
                }
                if (str4 == null) {
                    sb3.append(" name");
                }
                dq9.m(ts2.n("Missing required properties:", sb3));
                return null;
            default:
                return w03.f(jsonReader);
        }
    }

    @Override // z0c
    public final Object apply(Object obj) {
        i93.b.getClass();
        return w03.a.s((s03) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // x76
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        switch (this.a) {
            case 10:
                ukVar.getClass();
                break;
            case 11:
                ukVar.getClass();
                break;
            case 12:
                ukVar.getClass();
                break;
            case 13:
                ukVar.getClass();
                break;
            case 14:
                ukVar.getClass();
                break;
            case 15:
                ukVar.getClass();
                break;
            case 16:
                ukVar.getClass();
                break;
            case 17:
                ukVar.getClass();
                break;
            case 18:
                ukVar.getClass();
                break;
            case 19:
                ukVar.getClass();
                break;
            case 20:
                ukVar.getClass();
                break;
            case 21:
                ukVar.getClass();
                break;
            case 22:
                ukVar.getClass();
                break;
            case 23:
                ukVar.getClass();
                break;
            case 24:
                ukVar.getClass();
                break;
            case 25:
                ukVar.getClass();
                break;
            case 26:
                ukVar.getClass();
                break;
            case 27:
                ukVar.getClass();
                break;
            case 28:
                ukVar.getClass();
                break;
            default:
                ukVar.getClass();
                break;
        }
    }

    public /* synthetic */ u03(tk tkVar, int i, byte b) {
        this.a = b;
    }

    public /* synthetic */ u03(byte b) {
        this.a = b;
    }

    public /* synthetic */ u03(tk tkVar, Object obj, byte b) {
        this.a = b;
    }

    public /* synthetic */ u03(tk tkVar, String str, long j, long j2, byte b) {
        this.a = b;
    }

    public /* synthetic */ u03(tk tkVar, boolean z) {
        this.a = (byte) 15;
    }

    public /* synthetic */ u03(tk tkVar, boolean z, int i, byte b) {
        this.a = b;
    }
}
