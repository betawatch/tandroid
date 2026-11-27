// default package

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qr4 implements d64 {
    public static final xi4 d = new xi4((byte) 15);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public qr4(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = o51.c;
        yve.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(o51.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (o51.e.equals(uuid)) {
            HashSet hashSet = gt6.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    @Override // d64
    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // d64
    public final c64 d() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new c64(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // d64
    public final or4 g(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, o51.d)) {
            uuid = o51.c;
        }
        return new or4(uuid, bArr);
    }

    @Override // d64
    public final byte[] h() {
        return this.b.openSession();
    }

    @Override // d64
    public final void i(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // d64
    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // d64
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        if (o51.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(gcc.r(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                efd.d("ClearKeyUtil", "Failed to adjust response data: ".concat(gcc.r(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // d64
    public final void m(final wz4 wz4Var) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: pr4
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                d1 d1Var = ((wa3) wz4Var.a).N;
                d1Var.getClass();
                d1Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // d64
    public final void r(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // d64
    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x019e, code lost:
    
        if ("AFTT".equals(r5) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0235, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0248  */
    @Override // d64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b64 u(byte[] bArr, List list, int i, HashMap hashMap) {
        byte[] bArr2;
        String str;
        String str2;
        gr3 gr3Var;
        byte[] bArr3;
        sx8 b;
        UUID uuid = this.a;
        gr3 gr3Var2 = null;
        if (list != null) {
            if (o51.e.equals(uuid)) {
                if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                    gr3 gr3Var3 = (gr3) list.get(0);
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        gr3 gr3Var4 = (gr3) list.get(i3);
                        byte[] bArr4 = gr3Var4.e;
                        bArr4.getClass();
                        if (Objects.equals(gr3Var4.d, gr3Var3.d) && Objects.equals(gr3Var4.c, gr3Var3.c) && lwe.b(bArr4) != null) {
                            i2 += bArr4.length;
                        }
                    }
                    byte[] bArr5 = new byte[i2];
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        byte[] bArr6 = ((gr3) list.get(i5)).e;
                        bArr6.getClass();
                        int length = bArr6.length;
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i4 += length;
                    }
                    gr3Var = new gr3(gr3Var3.b, gr3Var3.c, gr3Var3.d, bArr5);
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= list.size()) {
                        gr3Var = (gr3) list.get(0);
                        break;
                    }
                    gr3 gr3Var5 = (gr3) list.get(i6);
                    byte[] bArr7 = gr3Var5.e;
                    bArr7.getClass();
                    sx8 b2 = lwe.b(bArr7);
                    if ((b2 == null ? (short) -1 : b2.a) == 1) {
                        gr3Var = gr3Var5;
                        break;
                    }
                    i6++;
                }
            } else {
                gr3Var = (gr3) list.get(0);
            }
            byte[] bArr8 = gr3Var.e;
            bArr8.getClass();
            UUID uuid2 = o51.f;
            if (uuid2.equals(uuid)) {
                byte[] c = lwe.c(uuid, bArr8);
                if (c != null) {
                    bArr8 = c;
                }
                ey7 ey7Var = new ey7(bArr8);
                int o = ey7Var.o();
                short q = ey7Var.q();
                short q2 = ey7Var.q();
                if (q == 1 && q2 == 1) {
                    short q3 = ey7Var.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String y = ey7Var.y(q3, charset);
                    if (!y.contains("<LA_URL>")) {
                        int indexOf = y.indexOf("</DATA>");
                        if (indexOf == -1) {
                            efd.f("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = y.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + y.substring(indexOf);
                        int i7 = o + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i7);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i7);
                        allocate.putShort(q);
                        allocate.putShort(q2);
                        allocate.putShort((short) (str3.length() << 1));
                        allocate.put(str3.getBytes(charset));
                        bArr8 = allocate.array();
                    }
                } else {
                    efd.e("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArr8 = lwe.a(uuid2, null, bArr8);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 27 && Objects.equals(uuid, o51.d) && (b = lwe.b(bArr8)) != null) {
                bArr8 = lwe.a(o51.c, (UUID[]) b.d, b.b);
            }
            HashSet hashSet = gt6.a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str4 = Build.MODEL;
                if (!"AFTB".equals(str4)) {
                    if (!"AFTS".equals(str4)) {
                        if (!"AFTM".equals(str4)) {
                        }
                    }
                }
                bArr3 = lwe.c(uuid, bArr8);
            }
            bArr3 = bArr8;
            String str5 = gr3Var.d;
            str = (i8 < 26 && o51.d.equals(uuid) && ("video/mp4".equals(str5) || "audio/mp4".equals(str5))) ? "cenc" : str5;
            bArr2 = bArr3;
            gr3Var2 = gr3Var;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm mediaDrm = this.b;
        MediaDrm.KeyRequest keyRequest = mediaDrm.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] data = keyRequest.getData();
        if (o51.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = gcc.r(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!Objects.equals(propertyString, "1.2")) {
                }
            }
            if (TextUtils.isEmpty(defaultUrl) && gr3Var2 != null) {
                str2 = gr3Var2.c;
                if (!TextUtils.isEmpty(str2)) {
                    defaultUrl = str2;
                }
            }
            keyRequest.getRequestType();
            return new b64(defaultUrl, data);
        }
        defaultUrl = "";
        if (TextUtils.isEmpty(defaultUrl)) {
            str2 = gr3Var2.c;
            if (!TextUtils.isEmpty(str2)) {
            }
        }
        keyRequest.getRequestType();
        return new b64(defaultUrl, data);
    }

    @Override // d64
    public final int v() {
        return 2;
    }

    @Override // d64
    public final void x(byte[] bArr, ig8 ig8Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                zz.x(this.b, bArr, ig8Var);
            } catch (UnsupportedOperationException unused) {
                efd.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // d64
    public final boolean z(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean equals2 = uuid.equals(o51.e);
            MediaDrm mediaDrm = this.b;
            if (equals2) {
                if (i < 37) {
                    String propertyString = mediaDrm.getPropertyString("version");
                    if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                        equals = false;
                    }
                }
                equals = true;
            } else {
                equals = uuid.equals(o51.d);
            }
            if (equals) {
                return zz.q(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, o51.d)) ? uuid : o51.c, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(o51.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }
}
