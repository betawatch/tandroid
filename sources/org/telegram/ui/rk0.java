package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rk0 implements Comparator {
    public final /* synthetic */ ll0 a;

    public rk0(ll0 ll0Var) {
        this.a = ll0Var;
    }

    public final int a(TLRPC.SecureValueError secureValueError) {
        if (secureValueError instanceof TLRPC.TL_secureValueError) {
            return 0;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
            return 1;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
            return 2;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
            return 3;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
            return 4;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
            return 5;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
            return 6;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
            return 7;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
            return ll0.F0(this.a, ((TLRPC.TL_secureValueErrorData) secureValueError).field);
        }
        return 100;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((TLRPC.SecureValueError) obj);
        int a10 = a((TLRPC.SecureValueError) obj2);
        if (a2 < a10) {
            return -1;
        }
        return a2 > a10 ? 1 : 0;
    }
}
