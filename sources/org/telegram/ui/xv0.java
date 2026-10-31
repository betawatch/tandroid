package org.telegram.ui;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv0 implements Consumer {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ xv0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        ProfileActivity profileActivity = this.a;
        HashSet hashSet = profileActivity.h5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (profileActivity.getMessagesController().r7.f(profileActivity.e1, ((Integer) arrayList.get(i10)).intValue()) == null) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.E5(true);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
