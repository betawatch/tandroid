package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class y4 {
    public final x4 a = new x4(this);
    public final NotificationCenter b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object c;
    public final int d;
    public final int e;
    public bg.r0 f;
    public boolean g;

    public y4(int i9, TLObject tLObject, int i10) {
        this.c = tLObject;
        this.d = i9;
        this.e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
