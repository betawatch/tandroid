package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tk implements MessagesStorage.IntCallback {
    public final /* synthetic */ qn a;

    public tk(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i9) {
        this.a.G9(i9);
    }
}
