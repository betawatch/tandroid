package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public abstract class z4 {
    public final y4 a = new y4(this);
    public final NotificationCenter b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object c;
    public final int d;
    public final int e;
    public di.l5 f;
    public boolean g;

    public z4(int i10, TLObject tLObject, int i11) {
        this.c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
