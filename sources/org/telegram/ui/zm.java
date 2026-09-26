package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zm extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean canDeleteMessage(boolean z10, TLRPC.Chat chat) {
        return false;
    }
}
