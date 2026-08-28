package ub;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final ByteBuffer a;
    public final int b;
    public int c;

    public c(int i9, ByteBuffer byteBuffer) {
        switch (i9) {
            case 1:
                this.c = 0;
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
            default:
                this.a = byteBuffer;
                this.b = byteBuffer.position();
                break;
        }
    }

    public int a(int i9) {
        int a2;
        int i10 = this.c / 8;
        int i11 = this.b;
        ByteBuffer byteBuffer = this.a;
        int i12 = byteBuffer.get(i10 + i11);
        if (i12 < 0) {
            i12 += 256;
        }
        int i13 = this.c;
        int i14 = 8 - (i13 % 8);
        if (i9 <= i14) {
            a2 = ((i12 << (i13 % 8)) & 255) >> ((i14 - i9) + (i13 % 8));
            this.c = i13 + i9;
        } else {
            int i15 = i9 - i14;
            a2 = (a(i14) << i15) + a(i15);
        }
        byteBuffer.position(i11 + ((int) Math.ceil(this.c / 8.0d)));
        return a2;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i9, int i10) {
        int i11 = this.c;
        int i12 = 8 - (i11 % 8);
        int i13 = this.b;
        ByteBuffer byteBuffer = this.a;
        if (i10 <= i12) {
            int i14 = byteBuffer.get((i11 / 8) + i13);
            if (i14 < 0) {
                i14 += 256;
            }
            int i15 = i14 + (i9 << (i12 - i10));
            int i16 = (this.c / 8) + i13;
            if (i15 > 127) {
                i15 -= 256;
            }
            byteBuffer.put(i16, (byte) i15);
            this.c += i10;
        } else {
            int i17 = i10 - i12;
            c(i9 >> i17, i12);
            c(i9 & ((1 << i17) - 1), i17);
        }
        int i18 = this.c;
        byteBuffer.position((i18 / 8) + i13 + (i18 % 8 <= 0 ? 0 : 1));
    }
}
