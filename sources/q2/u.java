package q2;

import a8.ja;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import bg.n0;
import h2.l0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.cf;
import p4.q0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class u implements r {
    public static final q0 d = new q0(22);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public u(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = e2.l.c;
        ja.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(e2.l.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (e2.l.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // q2.r
    public final void A(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // q2.r
    public final void C(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // q2.r
    public final byte[] D(byte[] bArr, byte[] bArr2) {
        if (e2.l.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(l0.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e10) {
                h2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(l0.r(bArr2)), e10);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // q2.r
    public final void E(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // q2.r
    public final void I(byte[] bArr, m2.j jVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                n0.h(this.b, bArr, jVar);
            } catch (UnsupportedOperationException unused) {
                h2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ab, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0242, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    @Override // q2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p L(byte[] bArr, List list, int i7, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        e2.q qVar;
        byte[] bArr3;
        m6.n i10;
        UUID uuid = this.a;
        e2.q qVar2 = null;
        if (list != null) {
            boolean z10 = false;
            if (e2.l.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    e2.q qVar3 = (e2.q) list.get(0);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        e2.q qVar4 = (e2.q) list.get(i12);
                        byte[] bArr4 = qVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(qVar4.d, qVar3.d) && Objects.equals(qVar4.c, qVar3.c) && z3.p.i(bArr4) != null) {
                            i11 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i11];
                    int i13 = 0;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        byte[] bArr6 = ((e2.q) list.get(i14)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i13, length);
                        i13 += length;
                    }
                    qVar = new e2.q(qVar3.b, qVar3.c, qVar3.d, bArr5);
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= list.size()) {
                        qVar = (e2.q) list.get(0);
                        break;
                    }
                    e2.q qVar5 = (e2.q) list.get(i15);
                    byte[] bArr7 = qVar5.e;
                    bArr7.getClass();
                    m6.n i16 = z3.p.i(bArr7);
                    if ((i16 == null ? -1 : i16.a) == 1) {
                        qVar = qVar5;
                        break;
                    }
                    i15++;
                }
            } else {
                qVar = (e2.q) list.get(0);
            }
            byte[] bArr8 = qVar.e;
            bArr8.getClass();
            UUID uuid2 = e2.l.f;
            if (uuid2.equals(uuid)) {
                byte[] j3 = z3.p.j(uuid, bArr8);
                if (j3 != null) {
                    bArr8 = j3;
                }
                h2.x xVar = new h2.x(bArr8);
                int o4 = xVar.o();
                short q10 = xVar.q();
                short q11 = xVar.q();
                if (q10 == 1 && q11 == 1) {
                    short q12 = xVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y10 = xVar.y(q12, charset);
                    if (!y10.contains("<LA_URL>")) {
                        int indexOf = y10.indexOf("</DATA>");
                        if (indexOf == -1) {
                            h2.a.l("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y10.substring(indexOf);
                        int i17 = o4 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i17);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i17);
                        allocate.putShort(q10);
                        allocate.putShort(q11);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    h2.a.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = z3.p.a(uuid2, null, bArr8);
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 27 && Objects.equals(uuid, e2.l.d)) {
                z10 = true;
            }
            if (z10 && (i10 = z3.p.i(bArr8)) != null) {
                bArr8 = z3.p.a(e2.l.c, (UUID[]) i10.d, (byte[]) i10.c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = z3.p.j(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = qVar.d;
            str = (i18 < 26 && e2.l.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            qVar2 = qVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i7, hashMap);
        byte[] data = keyRequest.getData();
        if (e2.l.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = l0.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && qVar2 != null) {
                str2 = qVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new p(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = qVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new p(defaultUrl, data);
    }

    @Override // q2.r
    public final int M() {
        return 2;
    }

    @Override // q2.r
    public final boolean Y(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i7 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i7 >= 31) {
            boolean equals2 = uuid.equals(e2.l.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(e2.l.d);
            }
            if (equals) {
                return n0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i7 >= 27 || !Objects.equals(uuid, e2.l.d)) ? uuid : e2.l.c, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !uuid.equals(e2.l.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // q2.r
    public final Map a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // q2.r
    public final void f(final cf cfVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: q2.t
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i10, byte[] bArr2) {
                u uVar = u.this;
                cf cfVar2 = cfVar;
                uVar.getClass();
                android.support.v4.media.session.q qVar = ((f) cfVar2.a).N;
                qVar.getClass();
                qVar.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override // q2.r
    public final q n() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // q2.r
    public final synchronized void release() {
        int i7 = this.c - 1;
        this.c = i7;
        if (i7 == 0) {
            this.b.release();
        }
    }

    @Override // q2.r
    public final k2.b s(byte[] bArr) {
        int i7 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i7 < 27 && Objects.equals(uuid, e2.l.d)) {
            uuid = e2.l.c;
        }
        return new s(uuid, bArr);
    }

    @Override // q2.r
    public final byte[] v() {
        return this.b.openSession();
    }
}
