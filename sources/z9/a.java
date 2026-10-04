package z9;

import android.util.Base64;
import android.util.JsonReader;
import bb.h;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import q9.d;
import y9.e2;
import y9.o0;
import y9.r0;
import za.c0;
import za.i0;
import za.l;
import za.m0;
import za.s;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements b, d {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object E(cf.c cVar) {
        l lVar;
        i0 i0Var;
        c0 c0Var;
        h hVar;
        s sVar;
        m0 m0Var;
        switch (this.a) {
            case 4:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(cVar);
                return lVar;
            case 5:
                i0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(cVar);
                return i0Var;
            case 6:
                c0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(cVar);
                return c0Var;
            case 7:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(cVar);
                return hVar;
            case 8:
                sVar = FirebaseSessionsRegistrar.getComponents$lambda-4(cVar);
                return sVar;
            default:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(cVar);
                return m0Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // z9.b
    public Object a(JsonReader jsonReader) {
        char c10;
        char c11;
        String str = null;
        Long l4 = null;
        int i10 = 2;
        switch (this.a) {
            case 0:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            list = c.d(jsonReader, new a(i10));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                        case 1:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str2 = str != null ? "" : " name";
                if (num == null) {
                    str2 = str2.concat(" importance");
                }
                if (list == null) {
                    str2 = t8.b.v(str2, " frames");
                }
                if (str2.isEmpty()) {
                    return new r0(str, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            case 1:
                jsonReader.beginObject();
                Long l10 = null;
                String str3 = null;
                String str4 = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1153765347:
                            if (nextName2.equals("baseAddress")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null name");
                            }
                            str3 = nextString;
                            break;
                        case 1:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str4 = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                            break;
                        case 3:
                            l4 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str5 = l4 == null ? " baseAddress" : "";
                if (l10 == null) {
                    str5 = str5.concat(" size");
                }
                if (str3 == null) {
                    str5 = t8.b.v(str5, " name");
                }
                if (str5.isEmpty()) {
                    return new o0(str3, l4.longValue(), l10.longValue(), str4);
                }
                throw new IllegalStateException("Missing required properties:".concat(str5));
            default:
                return c.a(jsonReader);
        }
    }
}
