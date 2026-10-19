package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class um extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean canDeleteMessage(boolean z10, TLRPC.Chat chat) {
        return false;
    }
}
