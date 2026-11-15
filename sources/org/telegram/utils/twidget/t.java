package org.telegram.utils.twidget;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import org.telegram.ui.ActionBar.t1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements w, org.telegram.ui.ActionBar.q1, o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i7, Serializable serializable, Object obj) {
        this.a = i7;
        this.c = obj;
        this.b = serializable;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        vf.c.q((Context) this.c, Uri.parse((String) this.b), true, false);
    }

    @Override // org.telegram.utils.twidget.w
    public void run() {
        switch (this.a) {
            case 0:
                ((x) this.c).a((byte[]) this.b);
                break;
            default:
                ((WidgetEngineBackend) this.c).lambda$send$10((byte[]) this.b);
                break;
        }
    }

    @Override // org.telegram.utils.twidget.o0
    public Object run() {
        r0 r0Var = (r0) this.c;
        byte[] bArr = (byte[]) this.b;
        synchronized (r0Var) {
            if (bArr != null) {
                try {
                    if (r0Var.e.size() + bArr.length <= 16777216) {
                        r0Var.e.write(bArr, 0, bArr.length);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            r0Var.e.reset();
            throw new IllegalStateException("Widget engine: argument too large");
        }
        return null;
    }
}
