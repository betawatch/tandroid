package p2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import b8.zb;
import g2.n0;
import g2.y;
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
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements q {
    public static final org.telegram.utils.twidget.a d = new org.telegram.utils.twidget.a();
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public t(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = d2.m.c;
        zb.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(d2.m.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (d2.m.e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // p2.q
    public final byte[] C0() {
        return this.b.openSession();
    }

    @Override // p2.q
    public final void F1(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
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
    @Override // p2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o J1(byte[] bArr, List list, int i3, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        d2.r rVar;
        byte[] bArr3;
        l6.n i10;
        UUID uuid = this.a;
        d2.r rVar2 = null;
        if (list != null) {
            boolean z10 = false;
            if (d2.m.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    d2.r rVar3 = (d2.r) list.get(0);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        d2.r rVar4 = (d2.r) list.get(i12);
                        byte[] bArr4 = rVar4.e;
                        bArr4.getClass();
                        if (Objects.equals(rVar4.d, rVar3.d) && Objects.equals(rVar4.c, rVar3.c) && y3.q.i(bArr4) != null) {
                            i11 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i11];
                    int i13 = 0;
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        byte[] bArr6 = ((d2.r) list.get(i14)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i13, length);
                        i13 += length;
                    }
                    rVar = new d2.r(rVar3.b, rVar3.c, rVar3.d, bArr5);
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= list.size()) {
                        rVar = (d2.r) list.get(0);
                        break;
                    }
                    d2.r rVar5 = (d2.r) list.get(i15);
                    byte[] bArr7 = rVar5.e;
                    bArr7.getClass();
                    l6.n i16 = y3.q.i(bArr7);
                    if ((i16 == null ? -1 : i16.a) == 1) {
                        rVar = rVar5;
                        break;
                    }
                    i15++;
                }
            } else {
                rVar = (d2.r) list.get(0);
            }
            byte[] bArr8 = rVar.e;
            bArr8.getClass();
            UUID uuid2 = d2.m.f;
            if (uuid2.equals(uuid)) {
                byte[] j10 = y3.q.j(uuid, bArr8);
                if (j10 != null) {
                    bArr8 = j10;
                }
                y yVar = new y(bArr8);
                int o10 = yVar.o();
                short q10 = yVar.q();
                short q11 = yVar.q();
                if (q10 == 1 && q11 == 1) {
                    short q12 = yVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y9 = yVar.y(q12, charset);
                    if (!y9.contains("<LA_URL>")) {
                        int indexOf = y9.indexOf("</DATA>");
                        if (indexOf == -1) {
                            g2.a.l("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y9.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y9.substring(indexOf);
                        int i17 = o10 + 52;
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
                    g2.a.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = y3.q.a(uuid2, null, bArr8);
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 27 && Objects.equals(uuid, d2.m.d)) {
                z10 = true;
            }
            if (z10 && (i10 = y3.q.i(bArr8)) != null) {
                bArr8 = y3.q.a(d2.m.c, (UUID[]) i10.d, (byte[]) i10.c);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = y3.q.j(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = rVar.d;
            str = (i18 < 26 && d2.m.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            rVar2 = rVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i3, hashMap);
        byte[] data = keyRequest.getData();
        if (d2.m.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = n0.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.b.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && rVar2 != null) {
                str2 = rVar2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new o(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = rVar2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new o(defaultUrl, data);
    }

    @Override // p2.q
    public final int L1() {
        return 2;
    }

    @Override // p2.q
    public final void U0(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // p2.q
    public final p W() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // p2.q
    public final void W0(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // p2.q
    public final boolean l2(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i3 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i3 >= 31) {
            boolean equals2 = uuid.equals(d2.m.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(d2.m.d);
            }
            if (equals) {
                return cg.n0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i3 >= 27 || !Objects.equals(uuid, d2.m.d)) ? uuid : d2.m.c, bArr);
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
            boolean z10 = !uuid.equals(d2.m.d);
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

    @Override // p2.q
    public final void m(final i9 i9Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: p2.s
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i3, int i10, byte[] bArr2) {
                t tVar = t.this;
                i9 i9Var2 = i9Var;
                tVar.getClass();
                android.support.v4.media.session.q qVar = ((e) i9Var2.b).N;
                qVar.getClass();
                qVar.obtainMessage(i3, bArr).sendToTarget();
            }
        });
    }

    @Override // p2.q
    public final byte[] o1(byte[] bArr, byte[] bArr2) {
        if (d2.m.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(n0.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if (i3 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
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
                g2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(n0.r(bArr2)), e10);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p2.q
    public final Map r(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // p2.q
    public final j2.b r0(byte[] bArr) {
        int i3 = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i3 < 27 && Objects.equals(uuid, d2.m.d)) {
            uuid = d2.m.c;
        }
        return new r(uuid, bArr);
    }

    @Override // p2.q
    public final synchronized void release() {
        int i3 = this.c - 1;
        this.c = i3;
        if (i3 == 0) {
            this.b.release();
        }
    }

    @Override // p2.q
    public final void v0(byte[] bArr, l2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                cg.n0.h(this.b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                g2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }
}
