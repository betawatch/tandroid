// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w13 extends y13 {
    public final Context e;
    public o13 f;
    public Executor g;
    public CancellationSignal h;
    public final x03 i;

    public w13(Context context) {
        context.getClass();
        this.e = context;
        this.i = new x03(this, new Handler(Looper.getMainLooper()), (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176 A[Catch: JSONException -> 0x0190, all -> 0x0199, TryCatch #2 {JSONException -> 0x0190, blocks: (B:62:0x00fe, B:64:0x0105, B:66:0x010c, B:67:0x0119, B:69:0x011d, B:70:0x0122, B:73:0x0128, B:74:0x012d, B:76:0x0131, B:79:0x013b, B:82:0x016f, B:83:0x0172, B:85:0x0176, B:88:0x0180, B:90:0x0142, B:99:0x0165, B:100:0x016c), top: B:61:0x00fe, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xs4 d(fha fhaVar) {
        f43 f43Var;
        b50 b50Var;
        x40 x40Var;
        String jSONObject;
        ku8 ku8Var = fhaVar.r;
        String str = fhaVar.h;
        String str2 = fhaVar.a;
        String str3 = fhaVar.f;
        if (str3 != null) {
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            f43Var = new f43(str3, bundle, (byte) 2);
        } else {
            boolean z = false;
            JSONObject jSONObject2 = null;
            if (str != null) {
                str2.getClass();
                String str4 = fhaVar.b;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = fhaVar.c;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = fhaVar.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = fhaVar.n;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = fhaVar.e;
                if (uri == null) {
                    uri = null;
                }
                str2.getClass();
                str.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str6);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str7);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
                iy4 iy4Var = new iy4("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle2, (byte) 0);
                if (str2.length() <= 0) {
                    w26.j("id should not be empty");
                    throw null;
                }
                if (str.length() <= 0) {
                    w26.j("idToken should not be empty");
                    throw null;
                }
                f43Var = iy4Var;
            } else if (ku8Var != null) {
                b50 b50Var2 = ku8Var.f;
                z40 z40Var = ku8Var.e;
                a50 a50Var = ku8Var.d;
                LinkedHashMap linkedHashMap = lu8.a;
                JSONObject jSONObject3 = new JSONObject();
                if (a50Var != 0) {
                    b50Var = a50Var;
                } else if (z40Var != 0) {
                    b50Var = z40Var;
                } else {
                    if (b50Var2 == null) {
                        sc8.j("No response set.");
                        return null;
                    }
                    b50Var = b50Var2;
                }
                if (b50Var instanceof b50) {
                    b50 b50Var3 = b50Var;
                    v34 v34Var = b50Var3.a;
                    v34Var.getClass();
                    String str8 = b50Var3.b;
                    h1 h1Var = (h1) lu8.a.get(v34Var);
                    if (h1Var == null) {
                        throw new at4(new h1((byte) 26), b00.h("unknown fido gms exception - ", str8));
                    }
                    if (v34Var != v34.x || str8 == null || f9b.f(0, 2, str8, "Unable to get sync account") < 0) {
                        throw new at4(h1Var, str8);
                    }
                    throw new rs4("Passkey retrieval was cancelled by the user.");
                }
                if (b50Var instanceof z40) {
                    try {
                        qae qaeVar = ku8Var.c;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (qaeVar != null && qaeVar.p().length > 0) {
                                jSONObject4.put("rawId", und.b(qaeVar.p()));
                            }
                            String str9 = ku8Var.n;
                            if (str9 != null) {
                                jSONObject4.put("authenticatorAttachment", str9);
                            }
                            String str10 = ku8Var.b;
                            if (str10 != null && b50Var2 == null) {
                                jSONObject4.put(TeXSymbolParser.TYPE_ATTR, str10);
                            }
                            String str11 = ku8Var.a;
                            if (str11 != null) {
                                jSONObject4.put("id", str11);
                            }
                            String str12 = "response";
                            if (z40Var != 0) {
                                jSONObject2 = z40Var.b();
                            } else if (a50Var != 0) {
                                jSONObject2 = a50Var.b();
                            } else {
                                if (b50Var2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", (int) b50Var2.a.a);
                                        String str13 = b50Var2.b;
                                        if (str13 != null) {
                                            jSONObject2.put("message", str13);
                                        }
                                        str12 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                if (jSONObject2 != null) {
                                    jSONObject4.put(str12, jSONObject2);
                                }
                                x40Var = ku8Var.h;
                                if (x40Var == null) {
                                    jSONObject4.put("clientExtensionResults", x40Var.b());
                                } else if (z) {
                                    jSONObject4.put("clientExtensionResults", new JSONObject());
                                }
                                jSONObject = jSONObject4.toString();
                                jSONObject.getClass();
                            }
                            z = true;
                            if (jSONObject2 != null) {
                            }
                            x40Var = ku8Var.h;
                            if (x40Var == null) {
                            }
                            jSONObject = jSONObject4.toString();
                            jSONObject.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new ts4("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), (byte) 2);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(b50Var.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    jSONObject.getClass();
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                f43Var = new f43(jSONObject, bundle3, (byte) 3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                f43Var = null;
            }
        }
        if (f43Var != null) {
            return new xs4(f43Var);
        }
        throw new ts4("When attempting to convert get response, null credential found", (byte) 2);
    }

    public final o13 e() {
        o13 o13Var = this.f;
        if (o13Var != null) {
            return o13Var;
        }
        rp5.e("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.g;
        if (executor != null) {
            return executor;
        }
        rp5.e("executor");
        throw null;
    }

    public final void g(ws4 ws4Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        ws4Var.getClass();
        o13Var.getClass();
        executor.getClass();
        this.h = cancellationSignal;
        this.f = o13Var;
        this.g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        Context context = this.e;
        context.getClass();
        byte b = 0;
        gh0 gh0Var = new gh0(false);
        dh0 dh0Var = new dh0(false, null, null, true, null, null, false);
        fh0 fh0Var = new fh0(false, null, null);
        eh0 eh0Var = new eh0(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        fh0 fh0Var2 = fh0Var;
        eh0 eh0Var2 = eh0Var;
        boolean z = false;
        for (r13 r13Var : ws4Var.a) {
            if ((r13Var instanceof bt4) && !z) {
                if (j >= 231815000) {
                    LinkedHashMap linkedHashMap = lu8.a;
                    eh0Var2 = new eh0(((bt4) r13Var).e, true);
                } else {
                    LinkedHashMap linkedHashMap2 = lu8.a;
                    JSONObject jSONObject = new JSONObject(((bt4) r13Var).e);
                    String optString = jSONObject.optString("rpId", "");
                    optString.getClass();
                    if (optString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    fh0Var2 = new fh0(true, ure.a(jSONObject), optString);
                }
                z = true;
            }
        }
        boolean z2 = j > 241217000 ? ws4Var.b : false;
        q3d a = ske.a(context);
        new dh0(false, null, null, true, null, null, false);
        hh0 hh0Var = new hh0(gh0Var, dh0Var, a.l, false, 0, fh0Var2, eh0Var2, z2);
        agb b2 = bgb.b();
        b2.c = new f84[]{new f84("auth_api_credentials_begin_sign_in", 8L)};
        b2.a = new ln8(a, hh0Var);
        b2.b = false;
        b2.d = (char) 1553;
        a.e(0, b2.a()).addOnSuccessListener(new vu2(new u13(cancellationSignal, this, b), (byte) 6)).addOnFailureListener(new v82((Object) this, (Object) cancellationSignal, (byte) 11));
    }
}
