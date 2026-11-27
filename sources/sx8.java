// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class sx8 {
    public final short a;
    public final byte[] b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public sx8(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.c = str;
        this.a = i2;
        this.d = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.b = bArr;
    }

    public final int a() {
        short s = this.a;
        if (s != 2) {
            return s != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sx8(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.c = uuid;
        this.a = i;
        this.b = bArr;
        this.d = uuidArr;
    }
}
